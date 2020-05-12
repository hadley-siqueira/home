#include <stdio.h> 

/*
Esse algoritmo irá pedir três
número "a","b" e "c" e irá
verificar se o algarismo "c" 
entre algum intervalo
*/

int main() {
    int a;
    int b;
    int c;

    printf("A:");
    scanf("%i", &a);//pedido do primeiro algarismo
    
    printf("B:");
    scanf("%i", &b);//pedido do segundo algarismo
    
    printf("C:");
    scanf("%i", &c);//pedido do terceiro algarismo

    /*
    Tomada de decisão
    com todas as probabilidades 
    */

    if (a < c && b > c) {
        printf("O algarismo c está no intervalo entre a e b\n");
        printf("[%i, %i, %i]", a, c, b);
    } else if (b < c && a > c) {
        printf("O algarismo c está no intervalo entre b e a\n");
        printf("[%i, %i, %i]", b, c, a);
    } else {
        printf("O algarismo c não está no intervalo\n");
        if (a < b && b < c) {
            printf("[%i, %i, %i]", a, b, c);
        } else if (b < a && a < c) {
            printf("[%i, %i, %i]", b, a, c);
        } else if (c < a && a < b) {
            printf("[%i, %i, %i]", c, a, b);
        } else if (c < b && b < a) {
            printf("[%i, %i, %i]", c, b, a);
        }
    }
    printf("\n");
             
}
