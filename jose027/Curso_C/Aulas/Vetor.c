#include <stdio.h>

int main() {
    
    int vetor[5];

    for (int c = 0; c < 5; c = c + 1) {
        vetor[c] = c + 1;
        printf("%i ", vetor[c]);
    }
    printf("\n");
 }   
    
