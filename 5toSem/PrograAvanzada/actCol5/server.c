#include "header.h"
#include <string.h>

char buffer[20000];

void serves_client(int nsfd) {
	int number_sent, number_guess, i = 6000, j;
	int guess, answer;
	/*clock_t begin, end;
	double lat[5];//, lat2, lat3, lat4, lat5;
	for(i = 0; i < 5; i++){
		j = 0;
		begin = clock();
		while(j < 0){
			write(nsfd, &)
		}
		end = clock();
		lat[i] = (double)(end - begin);
	}*/
	while(1){
		read(nsfd, buffer, sizeof(buffer));
		write(nsfd, buffer, sizeof(buffer));
	}
	close(nsfd);
}

void server(char* ip, int port, char* program) {
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

		/* CONCURRENTE
		if ( (pid = fork()) < 0 ) {
			perror(program);
		} else if (pid == 0) {
			close(sfd);
			serves_client(nsfd);
			exit(0);
		} else {
			close(nsfd);
		}
		CONCURRENTE */

		serves_client(nsfd); // ITERATIVO
	}
}

int main(int argc, char* argv[]) {
	char ip[15];
	int port;
	port = DEFAULT_PORT;
	if (argc == 3) {
		strcpy(ip, argv[1]);
		port = atoi(argv[2]);
		if(port < 5000){
			printf("Port number must be greater than 5000\n");
			return -3;
		}
	} else {
		printf("usage: %s [dir] [port]\n", argv[0]);
		return -2;
	}

	server(ip, port, argv[0]);

	return 0;
}
