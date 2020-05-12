#include <stdio.h>

/*
Esse algoritmo contém um "Loop"
que contará do número 1 ao 
número 10 através da variável contador
*/ 

int main() {
    for (int contador = 1; contador <= 10; contador = contador + 1) { //Criação do loop "for"
        printf("%i \n", contador);
    }
}
