/*
	Hugo David Franco Avila
	A01654856
	Proyecto final
*/
#ifndef HEADER_H
#define HEADER_H

#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <sys/wait.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <sys/types.h>
#include <unistd.h>
#include <time.h>
#include <pwd.h>
#include <grp.h>
#include <sys/stat.h>
#include <dirent.h>
#include <string.h>

#define DEFAULT_PORT    9999
#define DEFAULT_IP      "127.0.0.1"

void snd_msg(int sfd, int code, char* data) {
	long length = strlen(data);
	write(sfd, &code, sizeof(code));
	write(sfd, &length, sizeof(length));
	write(sfd, data, length * sizeof(char));
}

#endif
