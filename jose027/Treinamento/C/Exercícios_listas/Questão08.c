#include <stdio.h>

int main() {
    int n = 0;
    int c = 0;
    int numeros[c];

    while (n != -1) {
        printf("Digite o número desejado: ");
        scanf("%i", &n);
        if (n != -1) {
            numeros[c] = n;
            c++;
        }
    }
    printf("Quantidades de valores digitados: %i\n", c);

    double soma = 0;
    for (int cont = 0; cont < c; cont++) {
        soma += numeros[cont];
    }
    
    int qtd_a_media = 0;
    int qtd_a_7 = 0;
    for (int cont = 0; cont < c; cont++) {
        if (numeros[cont] > soma / c) {
            qtd_a_media += 1;
        }
        if (numeros[cont] < 7) {  
            qtd_a_7 += 1;  
        }
    }
    printf("Soma dos valores digitados: %lf\n", soma);
    printf("Média dos valores digitados: %lf\n", soma / c);
    printf("Quantidade de números acima da média: %i\n", qtd_a_media);
    printf("Quantidade de números abaixo de sete: %i\n", qtd_a_7);
    printf("Algoritmo encerrado\n");
}
