#include <stdio.h>

/*
Esse algoritmo irá ter duas
strings e irá concatena-las
com seus devidos espaços
e alinhamentos
*/

int main() {
    char vetor_caractere[] = {'m','o','t','o','c','i','c','l','e','t','a','\0'};//primeira string
    char vetor_caractere2[] = {'r','a','d','i','c','a','l','\0'};//Segunda string

    for (int c = 0; c < 11; c++) {
        printf("%c", vetor_caractere[c]);
    }
    printf(" ");
   
    for (int c = 0; c < 7; c++) {
        printf("%c", vetor_caractere2[c]);
    }
    printf("\n");

}
