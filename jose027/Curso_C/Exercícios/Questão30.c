#include <stdio.h>

void impressaoMatriz(int qtd, int x[][qtd]) {
    int qtd;
    for (int c = 0; c < 3; c++) {
        for (int cont = 0; cont < qtd; cont++) {
            printf("|%i|", x[c][cont]);
        }
        printf("\n");
    }
}


int main() {
    int col1 = 3;
    int matriz[3][col1];
    int col2 = 5;
    int matriz_sarrus[3][col2];
    int n;    

    for (int c = 0; c < 3; c++) {
        for (int cont = 0; cont < 3; cont++) {
            matriz[c][cont] = n;
        }
    }
    impressaoMatriz(col1, matriz);

    for (int c = 0; c < 3; c++) {
        for (int cont = 0; cont < 3; cont++) {
            matriz_sarrus[c][cont] = matriz[c][cont];
            matriz_sarrus[c][cont + 3] = matriz[c][cont];
        }
    }
    impressaoMatriz(col2, matriz_sarrus);
}
