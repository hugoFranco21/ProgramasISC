/*
    Código hecho por:
    Francisco Javier Castillo Hdez A01208970
    Juan Jose Diaz Andre A01066352
    Hugo David Franco Avila A01654856
    
    Este archivo esta diseñado para encriptar un mensaje en
    texto claro con nuestro propio algoritmo de encriptación
    el cual recibe dos parametros:
    -Texto en claro
    -Llave dada por el usuario (En caso de que no ponga alguna
    se hara una llave random)

*/

#include <bits/stdc++.h>

using namespace std;

string printTillEnd(string decyphered, int size);
string randomizerKey(string key);
string randomStringGenerator ();
string algorithmFFF(string plainText, string firstKey, string secondKey);
char** changeKeyToMatrix(string s);
string changeMatrixToString(char** mat);
string reverseFFF(string plainText, string firstKey, string secondKey);
void changeColumns(char** matrix);
void changeRows(char** matrix);
void FXOR(char** text, char** firstKey);
void SXOR(char** text, char** secondKey);


int main(){

    string plainText;
    string firstKey;
    string secondKey;
    int size;
    string cypheredText, decypheredText;
    srand(time(NULL));


    
    cout << endl;
    cout<<"        Algoritmo FFF (Hugo, Paco, Juanjo)" << endl<< "     ----------------------------------------" <<endl<< endl;
    cout<<"Escribe el texto en claro: (De no más de 20 caracteres)"<< endl<< endl;
    getline (cin,plainText);
    cout << endl;
    cout<<"Escribe la llave con la que se encriptara: (De no más de 10 caracteres)" << endl<< endl;
    getline (cin,firstKey);
    cout << endl;
    firstKey = randomizerKey(firstKey);
    secondKey = randomizerKey(randomStringGenerator());
    size = plainText.length();
    cypheredText = algorithmFFF(plainText, firstKey, secondKey);
    cout<<"El mensaje cifrado es:" << endl<< endl;
    cout<<cypheredText << endl<< endl;
    cout<<"Tomando el mensaje cifrado y la llave se descifrara el mensaje\n";
    decypheredText = reverseFFF(cypheredText, firstKey, secondKey);
    cout<<"El mensaje decifrado es:" << endl<< endl;
    cout<<printTillEnd(decypheredText, size)<<endl<<endl;

    return 0;
}

string printTillEnd(string decyphered, int size){
    string output;
    for(int i = 0; i < size; i++){
        output += decyphered[i];
    }
    return output;
}

string randomizerKey(string key){
    int n = key.length();
    string output;
    for(int i = 0; i < 16; i++){
        output += key[rand() % n] + (rand() % 16);
    }
    return output;
}

string randomStringGenerator(){
    string output;
    for(int i = 0; i < 32; i++){
        output += (rand() % 222) + 33;
    }
    return output;
}

char** changeKeyToMatrix(string s){
    char **output = new char*[4];
    int aux = 0;
    for(int i = 0; i < 4; i++){
        output[i] = new char[4];
        for(int j = 0; j < 4; j++){
            output[i][j] = s[aux];
            aux++;
        }
    }
    return output;
}

string changeMatrixToString(char** mat){
    int aux = 0;
    string output;
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            output += mat[i][j];
        }
    }
    return output;
}

string algorithmFFF(string plainText, string firstKey, string secondKey){
    char **matrix;
    char **firstKeyMatrix, **secondKeyMatrix;
    int aux = 0;
    int laps;
    int n = plainText.length();
    string output;
    firstKeyMatrix  = changeKeyToMatrix(firstKey);
    secondKeyMatrix = changeKeyToMatrix(secondKey);
    
    while (aux < n) {
        //Generador de matrices
        matrix = new char*[4];
        for(int i = 0; i < 4; i++){
            matrix[i] = new char[4];
            for (int j = 0; j < 4; j++){
                if (aux < n) {
                    matrix[i][j] = plainText[aux];
                    aux++;
                } else {
                    matrix[i][j] = 'F';
                }
            }
        }
        laps = 0;
        while (laps < 15) {
            changeColumns(matrix);
            FXOR(matrix, firstKeyMatrix);
            SXOR(matrix, secondKeyMatrix);
            changeRows(matrix);
            laps++;
        }
        output += changeMatrixToString(matrix);
    }
    return output;
}

void changeColumns(char** matrix){
    //Change column 1 and column 3
    char auxCol [4];
    char auxCol2 [4];
    //Fill col 1 y col 2  in an aux variables
    for (int i = 0; i < 4 ; i++){
        auxCol[i]=matrix[i][0];
        auxCol2[i]=matrix[i][1];
    }
    //Change columns
    for (int i = 0; i < 4 ; i++){
    //Change col 1 into col 3
        matrix[i][0]=matrix[i][2];
        matrix[i][2]=auxCol[i];
    //Change col 2 into col 4
        matrix[i][1]=matrix[i][3];
        matrix[i][3]=auxCol2[i];
    }
}

void changeRows(char** matrix){
    //Change row 2 to row 3
    char auxRow [4];
    //Fill row 2 in an aux variable
    for (int i = 0; i < 4 ; i++){
        auxRow[i]=matrix[1][i];
    }
    //Change row 3 into row 2
    //and fill row 3 with row 2
    for (int i = 0; i < 4 ; i++){
        matrix[1][i]=matrix[2][i];
        matrix[2][i]=auxRow[i];
    }
}

void FXOR(char** text, char** firstKey){
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if(!((i&1) ^ (j&1))){
                text[i][j] = text[i][j] ^ firstKey[i][j];
            } 
        }
    }
}

void SXOR(char** text, char** secondKey){
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if((i&1) ^ (j&1)){
                text[i][j] = text[i][j] ^ secondKey[i][j];
            } 
        }
    }
}

string reverseFFF(string plainText, string firstKey, string secondKey){
    char **matrix;
    char **firstKeyMatrix, **secondKeyMatrix;
    int aux = 0;
    int laps;
    int n = plainText.length();
    string output;
    firstKeyMatrix  = changeKeyToMatrix(firstKey);
    secondKeyMatrix = changeKeyToMatrix(secondKey);
    
    while (aux < n) {
        matrix = new char*[4];
        for(int i = 0; i < 4; i++){
            matrix[i] = new char[4];
            for (int j = 0; j < 4; j++){
                if (aux < n) {
                    matrix[i][j] = plainText[aux];
                    aux++;
                } else {
                    matrix[i][j] = 'F';
                }
            }
        }
        laps = 0;
        while (laps < 15) {
            changeRows(matrix);
            FXOR(matrix, firstKeyMatrix);
            SXOR(matrix, secondKeyMatrix);
            changeColumns(matrix);
            laps++;
        }
        output += changeMatrixToString(matrix);
    }
    return output;
}

