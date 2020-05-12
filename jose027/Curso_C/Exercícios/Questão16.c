#include <stdio.h>

int main() {
    int qtd_multiplos = 0;
    int vetor_multiplos[qtd_multiplos];
    int n = 1; 
    
    while (n != 0) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);  
        if (n == 0) {
            printf("Algoritmo finalizado\n");
            break;
        } else if (n % 3 == 0 && n % 7 == 0) {     
            vetor_multiplos[qtd_multiplos] = n;
            qtd_multiplos += 1;
        }
       
    }
    printf("Quantidade de número múltiplos de 3 e 7: %i\n", qtd_multiplos);
    
    printf("*** Lista de números múltiplos de 3 e 7 ***\n");
    for (int c = 0; c < qtd_multiplos; c++) {
        printf("|%i|", vetor_multiplos[c]);
    }
    printf("\n");
}
