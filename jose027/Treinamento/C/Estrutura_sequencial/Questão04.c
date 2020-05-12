#include <stdio.h>

int main() {
    double nota1, nota2, nota3, nota4;

    printf("Digite o primeira nota: ");
    scanf("%lf", &nota1);
    
    printf("Digite o segunda nota: ");
    scanf("%lf", &nota2);
    
    printf("Digite o terceira nota: ");
    scanf("%lf", &nota3);
    
    printf("Digite a quarta nota: ");
    scanf("%lf", &nota4);

    printf("Média: %lf\n", (nota1 + nota2 + nota3 + nota4) / 4);
}
