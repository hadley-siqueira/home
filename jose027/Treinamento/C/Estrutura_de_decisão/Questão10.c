#include <stdio.h>

int main() {
    int dia;
    
    printf("Digite o  número desejado (entre 0 e 8): ");
    scanf("%i", &dia);

    if (dia < 1 || dia > 7) {
        printf("Dia inválido");
    } switch(dia) {
        case 1:printf("Domingo"); 
        break;
        case 2:printf("Segunda-feira"); 
        break;
        case 3:printf("Terça-feira"); 
        break;
        case 4:printf("Quarta-feira"); 
        break;
        case 5:printf("Quinta-feira"); 
        break;
        case 6:printf("Sexta-feira"); 
        break;
        case 7:printf("Domingo-feira"); 
        break;
    }
    printf("\n");
}
