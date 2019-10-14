#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/types.h>

#define SIZE 1

typedef unsigned char uchar;
typedef unsigned long int ulong;

uchar* voltear(uchar &a){
	a = ~a;
	return &a;
}

int main(int argc, char* argv[]){
	int source, destination;
	if(argc != 3){
		printf("usage: %s source destination\n", argv[0]);
		return -1;
	}
	if((source = open(argv[1], O_RDONLY)) < 0){
		perror(argv[0]);
		return -2;
	}
	if((destination = open(argv[2], O_WRONLY | O_CREAT | O_TRUNC, 0666)) < 0){
		perror(argv[0]);
		return -3;
	}
	ulong i = 0;
	uchar buffer[SIZE];
	ulong size = lseek(source, 0, SEEK_END);
	lseek(source, 0, SEEK_SET);
	uchar help;
	for(i = 0; i < size; i++){
		bytes = read(source, &help, sizeof(uchar));
		write(1, voltear(buffer), 1);
	}
	
	/*while((bytes = read(source, buffer, sizeof(uchar)*SIZE)) != 0){
		//bytes = ~bytes;
		//printf("%i\n", bytes);
		//imprimir(buffer);
		voltear(buffer);
		write(1, buffer, bytes);
	}*/
	close(source);
	close(destination);
	return 0;
}
