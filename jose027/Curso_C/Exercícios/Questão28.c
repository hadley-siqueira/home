#include <stdio.h>

/*
Esse algoritmo cria uma matriz
4X4 e pede para o usuário 
digitar 16 algarismos inteiros e 
positivos, depois pede para o usuário
digitar uma linha e uma coluna
exibindo os dados da linha e coluna
escolhidas, depois a soma todos os valores
da matriz e mostra a média, depois
mostra quantos e quais números são maiores
e menores que a média calculada, depois
mostra quantidade de números pares e a 
quantidade de números ímpares digitados 
pelo usuário do algoritmo
*/

int main() {
    int matriz[4][4];
    int n;
    int l; 
    int col;
    
    for (int c = 0; c < 4; c++) {
        for (int cont = 0; cont < 4; cont++) {
            printf("Digite o número: ");
            scanf("%i", &n);
            while (n <= 0) {
                printf("Digite o número novamente\n");
                printf("Digite o número: ");
                scanf("%i", &n);
            }
            matriz[c][cont] = n;
        }
    }

     for (int c = 0; c < 4; c++) {
        for (int cont = 0; cont < 4; cont++) {
            printf("|%i|", matriz[c][cont]);
        }
        printf("\n");
    }

    printf("Digite a linha desejada: ");
    scanf("%i", &l);

    for (int c = 0; c < 4; c++) {
        printf("|%i|", matriz[l][c]);
    }
    printf("\n");

    printf("Digite a coluna desejada: ");
    scanf("%i", &col);

    for (int c = 0; c < 4; c++) {
        printf("|%i|", matriz[c][col]);
    }
    printf("\n");

    printf("*** Diagonal principal ***\n");
    for (int c = 0; c < 4; c++) {
        printf("|%i|", matriz[c][c]);
    }
    printf("\n");

    printf("*** Diagonal secundária ***\n");
    printf("|%i|", matriz[0][3]);
    printf("|%i|", matriz[1][2]);
    printf("|%i|", matriz[2][1]);
    printf("|%i|", matriz[3][0]);
    printf("\n");

    printf("*** Soma de elementos da primeira linha e última coluna ***\n");
    int soma = 0;

    for (int c = 0; c < 4; c++) {
        soma += matriz[0][c];
        soma += matriz[c][3];
    }
    printf("Soma: %i\n", soma);

    printf("*** Soma dos elementos de toda a matriz ***\n");
    int soma2 = 0;

    for (int c = 0; c < 4; c++) {
        for (int cont = 0; cont < 4; cont++) {
            soma2 += matriz[c][cont];
        }
    }
    printf("Soma: %i\n", soma2);

    printf("*** Média dos elementos ***\n");
    float media = soma2 / 16.0;
    printf("Média: %f\n", media);
 
    int acima_media = 0;
    int abaixo_media = 0;
    int vetor_acima[acima_media];
    int vetor_abaixo[abaixo_media];
    int pares = 0;
    int impares = 0;
    
    for (int c = 0; c < 4; c++) {
        for (int cont = 0; cont < 4; cont++) {
            if (matriz[c][cont] % 2 == 0) {
                pares += 1;
            } else if (matriz[c][cont] % 2 == 1) {
                impares += 1;
            }
        }
    }

    for (int c = 0; c < 4; c++) {
        for (int cont = 0; cont < 4; cont++) {
            if (matriz[c][cont] > media) {
                vetor_acima[acima_media] = matriz[c][cont];
                acima_media += 1;
            } else if (matriz[c][cont] < media) {
                vetor_abaixo[abaixo_media] = matriz[c][cont];
                abaixo_media += 1;
            }
        }
    }
    
    printf("*** Quantidade de números acima da média ***\n");
    printf("Números acima da média: %i números\n", acima_media);
    for (int c = 0; c < acima_media; c++) {
        printf("|%i|", vetor_acima[c]);
    }printf("\n");

    printf("*** Quantidade de números abaixo da média ***\n");
    printf("Números abaixo da média: %i números\n", abaixo_media);
    for (int c = 0; c < abaixo_media; c++) {
        printf("|%i|",vetor_abaixo[c]);
    }printf("\n");

    printf("*** Quantidade de números par ***\n");
    printf("%i numeros pares\n", pares);

    printf("*** Quantidade de números ímpar ***\n");
    printf("%i números ímpares\n", impares);
}

