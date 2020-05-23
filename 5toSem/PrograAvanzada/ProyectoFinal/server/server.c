/*
	Hugo David Franco Avila
	A01654856
	Proyecto final
*/

#include "header.h"

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

void serves_client(int nsfd, char *ip, char *root, FILE *syslog) {
	short code;
	int or, dest;
	int size;
	long length, data_read;
	char* data;
	char pathname[PATH_MAX + NAME_MAX + 1];
	time_t clk;
	snd_msg(nsfd, 1, "Welcome\n");
	clk = time(NULL);
	fprintf(syslog, "[ %s ] %s ha arrivado al servidor", ctime(&clk), ip);
	printf("Usuario ha arrivado al servidor\n");
	while(1){
  	read(nsfd, &code, sizeof(short));
    read(nsfd, &size, sizeof(int));
    data = (char*) malloc(size * sizeof(char));
		read(nsfd, data, length * sizeof(char));
		//printf("data = %s\n", data);
    switch (code){
      case 101:
				if(data[0] == '/' && strstr(data, "..") == 0){
					sprintf(pathname, "%s%s", root, data);
					if(whatis(pathname) == 1){
						//or = open(argv[1], O_RDONLY)) < 0 ))

						if(access(pathname, R_OK) != 0){
		          snd_msg(nsfd, 201, "Permission denied\n");
		        } else {
							snd_msg(nsfd, 301, "Retrieving file\n");
						}
					} else if(whatis(pathname) == 0) {
						snd_msg(nsfd, 205, "Path is a directory\n");
					} else {
						snd_msg(nsfd, 202, "File not found\n");
					}
				} else {
					snd_msg(nsfd, 203, "Permission denied\n");
				}
				memset(pathname,0,sizeof(pathname));

        /* code */
      break;
      case 102:
        /* code */
				if(data[0] == '/' && strstr(data, "..") == 0){
					sprintf(pathname, "%s%s", root, data);
					if(whatis(pathname) == 0){

						snd_msg(nsfd, 302, "Retrieving directoty\n");
					} else if(whatis(pathname) == 1) {
						snd_msg(nsfd, 207, "Path is not a directory\n");
					} else {
						snd_msg(nsfd, 206, "Directory not found\n");
					}
				} else {
					printf("Permission denied\n");
					snd_msg(nsfd, 203, "Permission denied\n");
				}
				memset(pathname,0,sizeof(pathname));
      break;
      case 103:
        snd_msg(nsfd, 103, "Ending connection, goodbye!\n");
				close(nsfd);
				return;
      break;
    	default:
				snd_msg(nsfd, 204, "Unknown command\n");
		}
	}
	close(nsfd);
}

void server(char* ip, int port, char* program, char* root, FILE *syslog) {
	int sfd, nsfd, pid;
	struct sockaddr_in server_info, client_info;

	if ( (sfd = socket(AF_INET, SOCK_STREAM, 0)) < 0 ) {
		perror(program);
		exit(-1);
	}

	server_info.sin_family = AF_INET;
	server_info.sin_addr.s_addr = inet_addr(ip);
	server_info.sin_port = htons(port);
	if ( bind(sfd, (struct sockaddr *) &server_info, sizeof(server_info)) < 0 ) {
		perror(program);
		exit(-1);
	}

	listen(sfd, 1);
	while (1) {
		int len = sizeof(client_info);
		if ( (nsfd = accept(sfd, (struct sockaddr *) &client_info, &len)) < 0 ) {
			perror(program);
			exit(-1);
		}

		//* CONCURRENTE
		if ( (pid = fork()) < 0 ) {
			perror(program);
		} else if (pid == 0) {
			close(sfd);
			serves_client(nsfd, ip, root, syslog);
			exit(0);
		} else {
			close(nsfd);
		}
		//CONCURRENTE */

		//serves_client(nsfd); // ITERATIVO
	}
}

int main(int argc, char* argv[]) {
	char ip[15];
	char root[PATH_MAX + NAME_MAX + 1];
	int port, numroot;
	port = DEFAULT_PORT;
	FILE *syslog;
	syslog = fopen("system.log", "a");
	if(syslog == 0){
		printf("%s: unknown error, contact the system administrator", argv[0]);
	}
	if (argc == 4) {
		strcpy(ip, argv[1]);
		port = atoi(argv[2]);
		if(port < 5000){
			printf("Port number must be greater than 5000\n");
			return -2;
		}
		numroot = whatis(argv[3]);
		if(numroot != 0){
			printf("%s: path specified /%s/ isn't a directory\n", argv[0], argv[3]);
			return -3;
		}
	} else {
		printf("usage: %s ip port root_directory\n", argv[0]);
		return -1;
	}

	server(ip, port, argv[0], argv[3], syslog);
	//server(ip, port, argv[0]);
	fclose(syslog);
	return 0;
}
