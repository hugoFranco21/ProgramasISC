/* Hugo David Franco Ávila
A01654856
ITESM QRO */

#include <bits/stdc++.h>

using namespace std;

void print(double *data, int n);

void runTest(double *data, int n, char *fileName);

int main(int argc, char* argv[]){

    if(argc < 3){
        cout << "usage: " << "executable_name" << " source destination" << endl;
		return -1;
    }

    int n;
    int i = 0;

    ifstream inputFile(argv[1]);
    inputFile >> n;
    
    double *data = new double[n];

    while(inputFile >> data[i]) i++;

    inputFile.close();

    runTest(data, n, argv[2]);

    cout << "The results of the Run Test will be presented in a file called " << argv[2] << endl; 
    return 0;
} 

void runTest(double *data, int n, char * fileName){
    ofstream salida;
    salida.open(fileName, ios::out);
    double n1 = 0, n2 = 0;
    int r = 0, i = 1;
    double mur, sigr, zr;
    bool mayor = data[0] < data[1];
    if(mayor){
        n1++;
        salida << "+\t";
    } else {
        n2++;
        salida << "-\t";
    }
    for(i = 1; i < n - 2; i++){
        if(i % 9 == 0) salida << endl;
        if(data[i] < data[i + 1]){
            salida << "+\t"; 
            n1++;
            if(mayor){
                //do nothing
            } else {
                r++;
                mayor = true;
            }
        } else {
            salida << "-\t";
            n2++;
            if(mayor){
                r++;
                mayor = false;
            } else {
                //do nothing
            }
        }
    }
    if(data[i] < data[i + 1]){
        if(mayor){
            //do nothing
        } else {
            r++;
        }
        salida << "+\t" << endl;
        n1++;
    } else {
        if(mayor){
            r++;
        } else {
            //do nothing
        }
        salida << "-\t" << endl;
        n2++;
    }
    r++;
    mur = 2*(n1*n2)/(n1+n2) + 1;
    sigr = sqrt((2*n1*n2*(2*n1*n2 - n1 - n1)/((n1+n2)*(n1+n2)*(n1+n2-1))));
    zr = (r - mur)/sigr;
    salida << "Number of runs = " << r << endl;
    salida << "Number of + signs = " << n1 << endl;
    salida << "Number of - signs = " << n2 << endl;
    salida << "Mur" << " = " << mur << endl;
    salida << "Standard deviation = " << sigr << endl;
    salida << "Zr = " << zr << endl;
    if(abs(zr) > 1.96){
        salida << "Null hypothesis H0 is rejected, |Zr| is larger than 1.96" << endl;
    } else {
        salida << "Null hypothesis H0 is not rejected, |Zr| is smaller than 1.96" << endl;
    }
    salida.close();
}

void print(double *data, int n){
    for(int i = 0; i < n; i++){
        cout << data[i] << endl;
    }
}