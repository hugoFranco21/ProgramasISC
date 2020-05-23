#include "header.h"

int main(int argc, char* argv[]) {
  int sfd, number, answer, continuE, i, j;
	int port, guess;
	struct sockaddr_in server_info;
  double lat[6];
	if (argc != 3) {
	    printf("usage: %s [ip] [port]\n", argv[0]);
	    return -2;
	}

	port = atoi(argv[2]);
	if (port < 5000) {
		printf("%s: The port must be greater than 5000.\n", argv[0]);
		return -3;
	}

	if ( (sfd = socket(AF_INET, SOCK_STREAM, 0)) < 0 ) {
		perror(argv[0]);
		return -1;
	}

	server_info.sin_family = AF_INET;
	server_info.sin_addr.s_addr = inet_addr(argv[1]);
	server_info.sin_port = htons(port);
	if ( connect(sfd, (struct sockaddr *) &server_info, sizeof(server_info)) < 0 ) {
		perror(argv[0]);
		return -1;
	}
  clock_t begin, end;
  char un[1], dos[1024], tres[2048], cuatro[4096], cinco[8192], seis[16384];
  for(i = 0; i < 1; i++){
    un[i] = 'a';
  }
  for(i = 0; i < 1024; i++){
    dos[i] = 'a';
  }
  for(i = 0; i < 2048; i++){
    tres[i] = 'a';
  }
  for(i = 0; i < 4096; i++){
    cuatro[i] = 'a';
  }
  for(i = 0; i < 8192; i++){
    cinco[i] = 'a';
  }
  for(i = 0; i < 16384; i++){
    seis[i] = 'a';
  }
  /*for(i = 0; i < 5; i++){
  	j = 0;
  	begin = clock();
  	while(j < 0){
  		write(sfd, &)
  	}
  	end = clock();
  	lat[i] = (double)(end - begin);
  }*/
  j = 0;
  begin = clock();
  while(j < 1000){
    write(sfd, un, sizeof(un));
    read(sfd, un, sizeof(un));
  }
  end = clock();
  lat[0] = (double)(end - begin);
  lat[0] = lat[0]/1000.0;
  j = 0;
  begin = clock();
  while(j < 1000){
    write(sfd, dos, sizeof(dos));
    read(sfd, dos, sizeof(dos));
  }
  end = clock();
  lat[1] = (double)(end - begin);
  lat[1] = lat[1]/1000.0;
  j = 0;
  begin = clock();
  while(j < 1000){
    write(sfd, tres, sizeof(tres));
    read(sfd, tres, sizeof(tres));
  }
  end = clock();
  lat[2] = (double)(end - begin);
  lat[2] = lat[2]/1000.0;
  j = 0;
  begin = clock();
  while(j < 1000){
    write(sfd, cuatro, sizeof(cuatro));
    read(sfd, cuatro, sizeof(cuatro));
  }
  end = clock();
  lat[3] = (double)(end - begin);
  lat[3] = lat[3]/1000.0;
  j = 0;
  begin = clock();
  while(j < 1000){
    write(sfd, cinco, sizeof(cinco));
    read(sfd, cinco, sizeof(cinco));
  }
  end = clock();
  lat[4] = (double)(end - begin);
  lat[4] = lat[4]/1000.0;
  j = 0;
  begin = clock();
  while(j < 1000){
    write(sfd, seis, sizeof(seis));
    read(sfd, seis, sizeof(seis));
  }
  end = clock();
  lat[5] = (double)(end - begin);
  lat[5] = lat[5]/1000.0;
  close(sfd);
  printf("SIZE(B)\tTIME(MS)\n");
  printf("1\t%f\n", lat[0]);
  printf("1024\t%f\n", lat[1]);
  printf("2048\t%f\n", lat[2]);
  printf("4096\t%f\n", lat[3]);
  printf("8192\t%f\n", lat[4]);
  printf("16384\t%f\n", lat[5]);

	return 0;
}
