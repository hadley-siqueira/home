#include <stdio.h>

int main() {
    int dia; 
    int mes; 
    int ano;

    printf("Digite o dia desejado: ");
    scanf("%i", &dia);
    printf("Digite o mês desejado: ");
    scanf("%i", &mes);
    printf("Digite o ano desejado: ");
    scanf("%i", &ano);

    switch(mes) {
    case 1: 
    printf("%i de janeiro de %i", dia, ano);
    break;
    case 2: 
    printf("%i de fevereiro de %i", dia, ano);
    break;
    case 3: 
    printf("%i de março de %i", dia, ano);
    break;
    case 4: 
    printf("%i de abril de %i", dia, ano);
    break;
    case 5: 
    printf("%i de maio de %i", dia, ano);
    break;
    case 6: 
    printf("%i de junho de %i", dia, ano);
    break;
    case 7: 
    printf("%i de julho de %i", dia, ano);
    break;
    case 8: 
    printf("%i de agosto de %i", dia, ano);
    break;
    case 9:
    printf("%i de setembro de %i", dia, ano);
    break;
    case 10: 
    printf("%i de outubro de %i", dia, ano);
    break;
    case 11: 
    printf("%i de novembro de %i", dia, ano);
    break;
    case 12: 
    printf("%i de dezembro de %i", dia, ano);
    break;
    }
    printf("\n");
}
