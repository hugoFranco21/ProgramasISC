#include <bits/stdc++.h>

typedef long long int ll;

using namespace std;

void fillRandomArrays(int *arr, int n);
void fillInfoMatrix(int **info, int *arrivals, int *transactions, int n);
void printMatrix(int **mat, int n);
void printArray(int *arr, int n);
void test1(int *arr, int n);
void test2(int *arr, int n);
void printNiceMatrix(int **info, int *arr1, int *arr2, int hour, int n);
void advancedMetrics(int **info, int *arr1, int *arr2, int n);
int columnSum(int **info, int n, int column);
int arraySum(int *arr, int n);
int countOcurrences(int **info, int n, int column);
string niceTime(int startTime, int minutes);

int main(){
	int n, **info, i, *randomArrivals, *randomTransaction, hours;
	cout << "How many clients do you want for the simulation?" << endl;
	srand(time(NULL));
	cin >> n;
	info = new int*[n];
	for(i = 0; i < n; i++){
		info[i] = new int [5];
	}
	
	randomArrivals = new int[n];
	randomTransaction = new int[n];
	
	fillRandomArrays(randomArrivals, n);
	fillRandomArrays(randomTransaction, n);
	randomArrivals[0] = 0;
	
	hours = 9;
	
	fillInfoMatrix(info, randomArrivals, randomTransaction, n);
	printNiceMatrix(info, randomArrivals, randomTransaction, hours, n);
	
	advancedMetrics(info, randomArrivals, randomTransaction, n);
	
	return 0;
}

void fillRandomArrays(int *arr, int n){
	for(int i = 0; i < n; i++){
		arr[i] = (rand() % 10) + 1;
	}
}

void fillInfoMatrix(int **info, int *arrivals, int *transactions, int n){
	info[0][0] = arrivals[0];
	info[0][1] = 0;
	info[0][2] = transactions[0];
	info[0][3] = 0;
	info[0][4] = 0;
	for(int i = 1; i < n; i++){
		info[i][0] = info[i - 1][0] + arrivals[i];
		info[i][1] = info[i][0] <= info[i - 1][2] ? info[i-1][2] : info[i][0];
		info[i][2] = info[i][1] + transactions[i];
		info[i][3] = info[i][1] > info[i][0] ? info[i][1] - info[i][0] : 0;
		info[i][4] = info[i][1] > info[i-1][2] ? info[i][1] - info[i-1][2]: 0;
	}
}

void printMatrix(int **mat, int n){
	for(int i = 0; i < n; i++){
		for(int j = 0; j < 5; j++){
			cout << mat[i][j] << " ";
		}
		cout << endl;
	}
}

void printNiceMatrix(int **info, int *arr1, int *arr2, int hour, int n){
	string s = " ";
	cout << "Client\t" << "| Interarrival time " << "| Hour of arrival " << "| Transaction time " << "| Service begins " << "| Service ends at " << "| Client waiting time " << "| ATM Idle time " << endl;
	for(int i = 0; i < n; i++){
		s = info[i][3] < 10 ? " " : "";
		cout << i+1 << "\t| " << arr1[i] << "\t\t    | " << niceTime(hour, info[i][0]) << "\t      | " << arr2[i] << "\t\t | " << niceTime(hour, info[i][1]) << "\t  | " << niceTime(hour, info[i][2]) << "\t    | " << info[i][3] << s << " \t          | " << info[i][4] << endl;
	}		
}

string niceTime(int startTime, int minutes){
	int carry = minutes / 60;
	int minu = minutes % 60;
	int hours;
	hours = (startTime + carry) % 24;
	string s = to_string(hours);
	s += ":";
	if(minu < 10){
		s += "0";
		s += to_string(minu);
	} else {
		s += to_string(minu);
	}
	if(s.length() == 4){
		s += " ";
	}
	return s;
}

void advancedMetrics(int **info, int *arr1, int *arr2, int n){
	cout << "Average waiting time per client" << endl;
	cout << columnSum(info, n, 3) << " min / " << n << " clients = " << (float) columnSum(info, n, 3) / (float) n << " minutes to be attended" << endl << endl;
	cout << "Probability that a client will wait in the line" << endl;
	cout << countOcurrences(info, n, 3) << " waiting clients / " << n << " clients = " << (float) countOcurrences(info, n, 3) / (float) n * 100 << " %" << endl << endl;
	cout << "Percentage of the ATM's idle time" << endl;
	cout << columnSum(info, n, 4) << " min inactive / " << info[n-1][2] - info[0][1] << " min = " << (float) columnSum(info, n, 4) / (float) (info[n-1][2] - info[0][1]) * 100 << " %" << endl << endl;
	cout << "Average transaction time" << endl;
	cout << arraySum(arr2, n) << " total transaction mins / " << n << " clients = " << (float) arraySum(arr2, n) / (float) n << " min for a transaction" << endl;
}

int arraySum(int *arr, int n){
	int acum = 0;
	for(int i = 0; i < n; i++){
		acum += arr[i];
	}
	return acum;
}

int columnSum(int **info, int n, int column){
	int acum = 0;
	for(int i = 0; i < n; i++){
		acum += info[i][column];
	}
	return acum;
}

int countOcurrences(int **info, int n, int column){
	int acum = 0;
	for(int i = 0; i < n; i++){
		if(info[i][column]) acum++;
	}
	return acum;
}

void printArray(int *arr, int n){
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}
	cout << endl;
}

void test1(int *arr, int n){
	arr[0] = 0;
	arr[1] = 1;
	arr[2] = 10;
	arr[3] = 1;
	arr[4] = 10;
	arr[5] = 8;
	arr[6] = 2;
	arr[7] = 10;
	arr[8] = 2;
	arr[9] = 3;
}

void test2(int *arr, int n){
	arr[0] = 4;
	arr[1] = 1;
	arr[2] = 5;
	arr[3] = 4;
	arr[4] = 2;
	arr[5] = 3;
	arr[6] = 2;
	arr[7] = 1;
	arr[8] = 3;
	arr[9] = 2;
}