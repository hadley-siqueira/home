#include <stdio.h>

/*
Esse algoritmo irá pedir um número
e verificar por meio de uma tomada
de decisão se o algarismo digitado
é divisível por 3, 4 e 5 ao mesmo 
tempo, caso seja divisível o algoritmo
irá dividí-los e mostrar os resultados 
ao usuário
*/

int main() {
    int n;
    
    printf("Digite o número desejado: ");
    scanf("%i", &n);//Validação do número digitado pelo usuário

    /*
    Tomada de decisão que irá verificar
    se o número digitado pelo usuário
    é divisível por 3, 4 e 5 ao mesmo tempo 
    */

    if (n % 3 == 0 && n % 4 == 0 && n % 5 == 0) {
        printf("O número %i é divisível por 3, 4 e 5 ao mesmo tempo\n", n);
        printf("%i / 3 = %i\n", n, n/3);
        printf("%i / 4 = %i\n", n, n/4);
        printf("%i / 5 = %i\n", n, n/5);
    } else {
        printf("O número %i não é divisível por 3, 4 e 5 ao mesmo tempo\n", n);
    }
}
