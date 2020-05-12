#include <stdio.h>

int main() {
    double nota1, nota2, nota3;

    printf("Digite a primeira nota: ");
    scanf("%lf", &nota1);
    
    printf("Digite a segunda nota: ");
    scanf("%lf", &nota2);
    
    printf("Digite a terceira nota: ");
    scanf("%lf", &nota3);

    printf("Média: %lf\n", (nota1 + nota2 + nota3) / 3);
}
