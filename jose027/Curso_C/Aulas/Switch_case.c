#include <stdio.h>

/*
O algoritmo irá disponibilizar
uma opção a ser digitada para
mostrar o dia de acordo com
o número digitado pelo usuário
*/

int main() {
    int dia_semana;

    printf("Digite o número desejado: ");
    scanf("%i", &dia_semana);
 
    switch(dia_semana) {
        case 1:
        printf("Domingo\n");
        break;//quebra de ciclo
        case 2:
        printf("Segunda-feira\n");
        break;//quebra de ciclo
        case 3:
        printf("Terça-feira\n");
        break;//quebra de ciclo
        case 4:
        printf("Quarta-feira\n");
        break;//quebra de ciclo
        case 5:
        printf("Quinta-feira\n");
        break;//quebra de ciclo
        case 6:
        printf("Sexta-feira\n");
        break;//quebra de cico
        case 7:
        printf("Sábado\n");
        break;//quebra de ciclo
    }
}

    
