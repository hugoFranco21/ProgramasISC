/*
	Programacion avanzada
	Examen Final
	Hugo David Franco Avila
	A01654856
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <dirent.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <time.h>
#include <pwd.h>
#include <grp.h>
#include <fcntl.h>

typedef unsigned long int ulong;

int whatis(char *name){
	struct stat info;
	if(lstat(name, &info) < 0){
		return -1;
	}
	if(S_ISDIR(info.st_mode)){
		return 0;
	} else if(S_ISREG(info.st_mode)){
		return 1;
	} else {
		return -1;
	}
}

ulong size_archivo(char *filename){
	ulong tam;
	struct stat info;
	lstat(filename, &info);
	tam = info.st_size;
	return tam;
}

void lee_directorio(char *directory, int act_depth, int depth, char *file){
	if(act_depth > depth) return;
	printf("Working in %s\n", directory);
	FILE *source;
	FILE *destination;
	destination = fopen(file, "a");
	if(destination == 0){
		printf("BIG ERROR\n");
		return;
	}
	DIR* dir;
	struct dirent *direntry;
	char pathname[PATH_MAX + NAME_MAX + 1];
	char filename[PATH_MAX + NAME_MAX + 1];
	char buffer[256];
	dir = opendir(directory);
	while ( (direntry = readdir(dir)) != NULL){
		if(strcmp(direntry->d_name, ".") != 0 && strcmp(direntry->d_name, "..") != 0){
			//fprintf(stdout, "%s\n", direntry->d_name);

			sprintf(filename, "%s/%s", directory, direntry->d_name);
			//printf("%s %i\n", filename, whatis(filename));
			if (whatis(filename) == 1) {

				source = fopen(filename, "r");
				if(source == 0){
					printf("%s cannot be read...\n", filename);
				} else {
					printf("merging %s...\n", filename);
					while(fgets(buffer, sizeof(buffer), source)) {
	        	fprintf(destination, "%s", buffer);
	    		}
					fclose(source);
				}
			} else if(whatis(filename) == 0){
				continue;
			}
			memset(filename,0,sizeof(filename));
		}
	}
	rewinddir(dir); act_depth++;
	while ( (direntry = readdir(dir)) != NULL){
		if(strcmp(direntry->d_name, ".") != 0 && strcmp(direntry->d_name, "..") != 0){
			//fprintf(stdout, "%s\n", direntry->d_name);

			sprintf(pathname, "%s/%s", directory, direntry->d_name);
			//printf("%s %i\n", filename, whatis(filename));
			if (whatis(pathname) == 1) {
				/*printf("merging %s...\n", filename);
				source = fopen(filename, "r");
				if(source == 0){
					printf("%s cannot be read...\n", filename);
				}
				while(fgets(buffer, sizeof(buffer), source)) {
        	fprintf(destination, "%s", buffer);
    		}
				fclose(source);*/
			} else if(whatis(pathname) == 0){
				lee_directorio(pathname, act_depth, depth, file);
			}
			memset(filename,0,sizeof(filename));
		}
	}

	fclose(destination);
}


int main(int argc, char* argv[]){
	int depth;
	char dir_name[PATH_MAX + 1];
	char *directory;
	FILE *output;
	if(argc != 4){
		fprintf(stderr, "usage: %s directory merge_file max_level\n", argv[0]);
		return -1;
	}
	if(whatis(argv[1]) != 0){
		fprintf(stderr, "opendir: No such file or directory\n");
		return -2;
	}
	output = fopen(argv[2], "w");
	if ( output == 0 ) {
		fprintf(stderr, "%s filename not valid\n", argv[0]);
		return -3;
	}
	fclose(output);
	depth = atoi(argv[3]);
	if(depth < 1){
		fprintf(stderr, "%s: the max level must be a positive integer number greater than 1\n", argv[0]);
		return -3;
	}
	lee_directorio(argv[1], 1, depth, argv[2]);
	return 0;
}
