#include <stdio.h>

int main() {

    int matriz[3][3];

    matriz[0][0] = 7;
    matriz[0][1] = 6;
    matriz[0][2] = 9;
    
    matriz[1][0] = 5;
    matriz[1][1] = 1;
    matriz[1][2] = 9;
    
    matriz[2][0] = 5;
    matriz[2][1] = 5;
    matriz[2][2] = 10;

    for (int c = 0; c < 3; c++) {
        for (int cont = 0; cont < 3; cont++) {
            printf("%i ", matriz[c][cont]);
        }
        printf("\n");
    }
}
        
