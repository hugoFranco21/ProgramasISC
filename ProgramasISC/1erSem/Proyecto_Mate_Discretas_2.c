#include  <stdio.h>
#include <math.h>
#include <stdlib.h>

char pFigura(int figura){
    switch(figura){
        case 1: return 'T';
        break;
        case 2: return 'D';
        break;
        case 3: return 'C';
        break;
    }
}

char pColor(int color){
    switch(color){
        case 1: return 'R';
        break;
        case 2: return 'A';
        break;
    }
}

char pLetra(int letra){
    switch(letra){
        case 1: return 'a';
        break;
        case 2: return 'b';
        break;
        case 3: return 'c';
        break;
        case 4: return 'd';
        break;
        case 5: return 'e';
        break;
        case 6: return 'f';
        break;
        case 7: return 'g';
        break;
    }
}

void asigna (int color[5][5], int letra[5][5], int figura[5][5], int i, int j, int c, int f, int l){
    color[i][j]=c;
    letra[i][j]=l;
    figura[i][j]=f;
}

void Tarski(){
    int i, j, o1, o2, o3, o4, o5;
    int color[5][5], letra[5][5], figura[5][5];

    //Inicializa las tres matrices
    for(i=0; i<5; i++){
        for(j=0; j<5; j++){
            color[i][j]=0;
            letra[i][j]=0;
            figura[i][j]=0;
        }
    }

    //Asigna las figuras a las matrices

    asigna(color, letra, figura, 0, 0, 2, 1, 1);
    asigna(color, letra, figura, 1, 1, 2, 1, 2);
    asigna(color, letra, figura, 1, 2, 1, 3, 3);
    asigna(color, letra, figura, 2, 2, 1, 2, 7);
    asigna(color, letra, figura, 2, 3, 1, 2, 6);
    asigna(color, letra, figura, 3, 2, 1, 2, 5);
    asigna(color, letra, figura, 3, 3, 1, 3, 4);

    //Imprime matriz
    for(i=0; i<5; i++){
        for(j=0; j<5; j++){
            if (letra[i][j]==0) printf("--- ");
            else{
                printf("%c", pLetra(letra[i][j]));
                printf("%c", pFigura(figura[i][j]));
                printf("%c ", pColor(color[i][j]));
            }
        }
        printf("\n");
    }
    printf("Cada grupo de 3 caracteres esta organizado de forma Letra-Figura-Color\nLas figuras son T:triangulo, D:cuadrado: C:circulo\nLos colores son Rojo y Azul");
    printf("\n\nCon base en la tabla escribe 0 si es falso o 1 si es verdadero para las siguientes afirmaciones\n");
    printf("1. At, Circulo(t) || Rojo(t)\n");
    scanf("%i", &o1);
    printf("2. Et, Cuadrado(t) && Rojo(t)\n");
    scanf("%i", &o2);
    printf("3. At, Cuadrado(t) && Rojo(t)\n");
    scanf("%i", &o3);
    printf("4. At, Triangulo(t) || Rojo(t)\n");
    scanf("%i", &o4);
    printf("5. Et, Cuadrado(t) && Azul(t)\n");
    scanf("%i", &o5);

    printf("Sus resultados son: 1:%i 2:%i 3:%i 4:%i 5:%i\n\n", o1==0, o2!=0, o3==0, o4=!0, o5==0);
}

int main(void){
    int inicio=0,fin=1;
    do{int elec;
    printf("\tEL MUNDO DE LOS BINARIOS\n");
    printf("1. Temas vistos en clase\n2. Correr el mundo de los binarios\n3. Manual de usuario\n4. Salir\n");
    scanf("%i", &elec);
    switch(elec){
    case 1:
        {
        printf("\t TEMAS DE CLASE\n");
        printf("1. Predicados\n2. Argumentacion\n3. Metodos de demostracion\n");
        scanf("%i", &elec);
        switch(elec){
        case 1 : printf("CUANTIFICADORES\nUniversal: es definida a ser verdadera si y solo si Q(x) es verdadera para todo elemento x que esta en el dominio D.\nExistencial: Y es definida a ser verdadera si y solo si existe en el dominio D al menos un valor de x para el cual Q(x) es verdadera.\n\nMUNDO DE TARSKI:\nEl mundo de tarski es una aproximacion educativa basada en ordenador al estudio de la logica de primer orden.\n\nNEGACION DE CUANTIFICADORES\nNegacion Universal: ocurre cuando no es cierto que para todo x de D, P(x) es verdadera. Es decir,cuando existe al menos un elemento de D para el cual P es falsa.\nNEGACION EXISTENCIAL: ocurre cuando no es cierto que exista un elemento de D para el cual P es cierta. Es decir, cuando P es falsa para todos los elemento de D.\n\nSUFICIENTE Y NECESARIO\nSuficiente: Px pertenece a D, r(x) es condicion suficiente para s(x). Px pertenece a D, r(x) por lo tanto s(x).\nNecesario: Px pertenece D, r(x) es condicion necesaria para s(x). Px pertence a  D, s(x) por lo tanto r(x).\n\nPRUEBA POR VACUIDAD\nUna afirmacion es verdadera cuando su negacion es falsa, este hecho simple es la base de la prueba por vacuidad.\n");
        break;
        case 2 : printf("REGLAS DE INFERENCIA\nEs una forma logica que consiste en una funcion que toma premisas, analiza sus sintaxis y devuelve una conclusion.\n\nERRORES EN LA ARGUMENTACION\nError en la reciproca: es una falacia formal que se comete al razonar segun la siguiente forma argumental:\nl: Si A, entonces B\n2: B\n3: Por lo tanto, A\nLos argumentos de esta forma son invalidos, porque la verdad de las premisas no garantiza la verdad de la conclusion\nNegacion del antecedente: es una falacia formal que se comete al razonar segun la siguiente forma argumental:\n1: Si A, entonces B\n2: No A\n3: Por lo tanto, no B\nLos argumentos de esta forma son invalidos, porque la verdad de las premisas no garantiza la verdad de la conclusion.\n\nARGUMENTOS VALIDOS FOL\nUn argumento vaAlido en FOL es un argumento que es valido para cualquier interpretacion posible.");
        break;
        case 3 : printf("METODO DIRECTO\nSi la hipotesis sea verdadera la unica condicion para que la implicacion sea\nverdadera es que la conclusion sea verdadera.\nProbar que, bajo el supuesto de que la hipotesis es verdadera, la conclusion es verdadera.\n\nMETODO INDIRECTO\nSi la conclusion es falsa la unica condicion para que la implicacion sea verdadera \nes que la hipotesis sea falsa.\nLa implicacion es verdadera, vea que bajo el supuesto de que la conclusion es falsa la hipotesis es falsa.\n\nMETODO REDUCCION A LO ABSURDO\n Si la suposicion de p sea verdadera lleva a una contradiccion (F) entonces p debe ser falsa, es decir\n no p debe ser verdadera.\n");
        break;
        }}
    break;
    case 2:
        {
        Tarski();
        }
        break;
    case 3 :
        {
        printf("\t MANUAL DE USUARIO\nEn este programa, se muestra un menu con 4 opciones, las cuales son:\nTemas vistos en clase\nEsta opcion despliega otro menu con los tres temas principales vistos este parcial, que son: \npredicados, argumentacion, y metodos de demostracion.\nAl seleccionar cualquiera de las tres opciones, imprime la informacion correspondiente a los\nsubtemas de esas areas de la logica, y posteriormente regresa al menu principal\n\nCorrer el mundo de los binarios\nEsta opcion imprime una matriz la cual contiene un mundo de Tarski en el cual se tiene un color, una \nfigura, y una letra asignado a determinados espacios en la cuadricula.\nPosteriormente, se despliegan algunas preguntas en las que se usan cuantificadores y predicados, y el usuario \ndebe contestar con un 1 o un 0, dependiendo si la proposicion es verdadera o falsa, al final, si el usuario tiene un \n1 en la pregunta significa que contesto de manera correcta, y si tiene un 0 es que lo hizo de manera incorrecta.\nAl terminar regresa al menu princial\n\nManual de usuario\nAl seleccionar esta opcion, se despliegan parrafos en los que se explica al usuario como funciona el programa, y \nque operacion realiza cada opcion. \nAl final regresa al menu principal.\n\nSalir\nAl seleccionar esta opcion, se cierra el programa.\n\n");
        }
        break;
    case 4 :
        {
        exit(0);
        }
        break;}
        inicio++;
        fin++;
        printf("\n");
        printf("\n");
        }
        while(inicio<fin);
        return 0;
}

