#include <stdio.h>

/*
Esse algoritmo irá pedir para o 
usuário digtar números e inseri-los
em um vetor até que o número digitado
seja 0, seguida mostrar os valores digitados
pelo usuário e depois mostrar os valores 
no índice ímpar
*/

int main() {
    int n;
    int qtd_numero;
    int v[qtd_numero];

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    v[0] = n;

    qtd_numero += 1;

    while (n != 0) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);
        if (n != 0) {
            v[qtd_numero] = n;
            qtd_numero += 1;
        }
    }
    
    printf("*** Vetor digitado pelo usuário ***\n");
    for (int c = 0; c < qtd_numero; c++) {
        printf("|%i|", v[c]);
    }
    printf("\n");

    printf("*** Valores do vetor em índices ímpar ***\n");
    for (int c = 0; c < qtd_numero; c++) {
        if (c % 2 == 1) {
            printf("|%i|", v[c]);
        }
    }
    printf("\n");
}
