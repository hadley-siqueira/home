#include <stdio.h>
#include <math.h>

/*
Esse algoritmo irá pedir ao usuário
para digitar um número, caso
esse número seja diferente de zero o
algoritmo irá calcular o quadrado do 
número digitado pelo usuário, caso 
contrário o algoritmo irá finalizar 
o programa informando ao usuário
*/

int main() {
    int n;
    
    //Laço de repetição que ficará ativo enquanto o número digitado pelo usuário for diferente de zero 
    while (n != 0) { 
        printf("Digite o número desejado: ");
        scanf("%i", &n);//validação do número digitado pelo usuário 
        if(n == 0) {//verificação que serve para analisar se o número digitado pelo usuário foi zero
            printf("Fim do algoritmo\n");
            break;//quebra de laço para finalizar o programa
        }

        int quadrado = pow(n, 2);

        printf("%i² = %i\n", n, quadrado);
    }
}

