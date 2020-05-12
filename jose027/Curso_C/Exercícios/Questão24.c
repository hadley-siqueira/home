#include <stdio.h>

/*
Esse algoritmo irá pedir para
o usuário digitar valores e em seguida 
irá automaticamente armazena-los em um
vetor após o usuário parar de digitar o 
número o algoritmo mostrará um vetor com
os números na ordem digitada e após a 
amostra mostrará os números na ordem 
inversa ao qual foi digitada
*/

int main() {
    int n;
    int qtd_numero = 0;
    int vetor[qtd_numero];

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    vetor[0] = n;

    qtd_numero += 1;

    while (n != 0) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);
        if (n != 0) {
            vetor[qtd_numero] = n;
            qtd_numero += 1;
        }
    }

    printf("*** Vetor digitado pelo usuário ***\n");
    for (int c = 0; c < qtd_numero; c++) {
        printf("|%i|", vetor[c]);
    }
    printf("\n");


    printf("*** Vetor na ordem inversa ***\n");
    for (int c = qtd_numero - 1; c > -1; c--) {
        printf("|%i|", vetor[c]);
    }
    printf("\n");
}

