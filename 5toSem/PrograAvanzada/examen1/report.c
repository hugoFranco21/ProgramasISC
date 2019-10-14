/*
	Programacion avanzada
	Examen 1
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

typedef unsigned long int ulong;

int dir_file(char *);
ulong size_archivo(char *);
void lee_directorio(char *);
ulong size_dir(char *);

int main(int argc, char* argv[]){
	char dir_name[PATH_MAX + 1];
	char *directory;
	if(argc > 2){
		fprintf(stderr, "usage: %s [directory]\n", argv[0]);
		return -1;
	} 
	getcwd(dir_name, PATH_MAX);
	directory = dir_name;
	if(argc == 2){
		directory = argv[1];
	} 
	//fprintf(stdout, "Directory %s\n", directory);
	if(dir_file(directory) == -1){
		fprintf(stderr, "%s: No such file or directory\n", argv[0]);
		return -2;
	} else if(dir_file(directory) != 0){
		fprintf(stderr, "%s: Not a directory\n", argv[0]);
		return -2;
	}
	lee_directorio(directory);
	return 0;
}

int dir_file(char *name){
	struct stat info;
	if(lstat(name, &info) < 0){
		return -1;
	}
	if(S_ISDIR(info.st_mode)){
		return 0;
	} else {
		return -2;
	}
}

ulong size_archivo(char *filename){
	ulong tam;
	struct stat info;
	lstat(filename, &info);
	tam = info.st_size;
	return tam;
}

ulong size_dir(char *directory){
	ulong sized = 0;
	DIR* dir;
	struct dirent *direntry;
	dir = opendir(directory);
	while ( (direntry = readdir(dir)) != NULL ) {
		if (strcmp(direntry->d_name, ".") != 0 &&
			strcmp(direntry->d_name, "..") != 0) {
			if (dir_file(direntry->d_name) != 0) {
				sized += size_archivo(direntry->d_name);
			} else {
				sized += size_dir(direntry->d_name);
			}
		}
	}
	return sized;
}

void lee_directorio(char *directory){
	DIR* dir;
	struct dirent *direntry;
	int cont = 0, size_min = 1e9, size_max = -1;
	char *max_file, *min_file;
	char pathname[PATH_MAX + NAME_MAX + 1];
	dir = opendir(directory);
	while ( (direntry = readdir(dir)) != NULL ) {
		if (strcmp(direntry->d_name, ".") != 0 &&
			strcmp(direntry->d_name, "..") != 0) {
			//fprintf(stdout, "%s\n", direntry->d_name);
			if (dir_file(direntry->d_name) != 0) {
				cont++;
				if(size_archivo(direntry->d_name) > size_max){
					size_max = size_archivo(direntry->d_name);
					max_file = direntry->d_name;
				}
				if(size_archivo(direntry->d_name) < size_min){
					size_min = size_archivo(direntry->d_name);
					min_file = direntry->d_name;
				}
			} else {
				sprintf(pathname, "%s/%s", directory, direntry->d_name);
				lee_directorio(pathname);
			}
		}
	}
	fprintf(stdout, "Directory: %s\n", directory);
	fprintf(stdout, "Ocuppied space: %lu\n", size_dir(directory));
	fprintf(stdout, "Total files: %i\n", cont);
	fprintf(stdout, "Min. file name: %s - size: %lu\n", min_file, size_archivo(min_file));
	fprintf(stdout, "Max. file name: %s - size: %lu\n\n", max_file, size_archivo(max_file));
	
	
}
