#include <stdio.h>

/*
Esse algoritmo irá pedir um número
enquanto esse número digitado pelo
usuário não for igual a 22, o algoritmo 
irá pedir que o usuário digite o número
sucessuvas vezes ao usuário
*/

int main() {
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);//validação do número digitado pelo usuário
    printf("Número digitado %i\n", n);

    while (n != 22) {//Laço de repetição que funcionará enquanto o número digitado for diferente de 22
        /*
        instrução no interior do lqço
        de repetição que funcionará
        enquanto o número digitado for
        diferente de 20
        */
        printf("Digite o número desejado: ");
        scanf("%i", &n);
        printf("Número digitado: %i\n", n);
    }
    printf("Fim do algoritmo\n");
}
