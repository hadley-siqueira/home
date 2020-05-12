#include <stdio.h>

/*
Esse algoritmo irá criar duas 
matrizes 2X2, e irá pedir para 
o usuário inserir valores em
cada uma, logo após o programa 
irá criar uma terceira matriz inserindo
valores resultantes da expressão
2*A-5B.
*/ 

void insercaoMatriz(int x[][2], int y) {
    for (int c = 0; c < 2; c++) {
        for (int cont = 0; cont < 2; cont++) {
            printf("Digite o número desejado: ");
            scanf("%i", &y);
            x[c][cont] = y;
        }
    }
}

void impressaoMatriz(int x[][2]) {
    for (int c = 0; c < 2; c++) {
        for (int cont = 0; cont < 2; cont++) {
            printf("|%i|", x[c][cont]);
        }
        printf("\n");
    }
}

int main() {
    int matrizA[2][2];
    int matrizB[2][2];
    int matrizC[2][2];
    int n;
    
    printf("*** MatrizA ***\n");
    //chamada das funções referente a matriz A
    insercaoMatriz(matrizA, n);
    impressaoMatriz(matrizA);
    
    printf("*** MatrizB ***\n");
    //chamada das funções referente a matriz B
    insercaoMatriz(matrizB, n);
    impressaoMatriz(matrizB);

    for (int c = 0; c < 2; c++) {
        for (int cont = 0; cont < 2; cont++) {
            matrizC[c][cont] = matrizA[c][cont] * 2 - (matrizB[c][cont] * 5);
        }
    }
    printf("*** MatrizC ***\n");
    //chamada da função referente a matriz C
    impressaoMatriz(matrizC);
}
