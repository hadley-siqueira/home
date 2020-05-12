#include <stdio.h>

/*
Esse algoritmo terá uma função
que está contida uma variável
estática, onde a mesma mudará
de valor a cade vez que a função 
for chamada, tendo seu valor normal
após o dfim da execução do progrma
*/

int multVariavelEstatica() {
    static int n = 3; //declaração e atribuição de valor à variável estática
    return n *= 3;
}

int main() {
    
    for (int c = 0; c < 3; c++) {
        int result = multVariavelEstatica();
        printf("%i ", result);
    }
    printf("\n");
}
