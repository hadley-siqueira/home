#include <stdio.h>

int main() {
    double n1;
    double n2;
    
    printf("Digite a primeira nota: ");
    scanf("%lf", &n1);

    printf("Digite a segunda nota: ");
    scanf("%lf", &n2);

    double media = (n1 + n2) / 2;
    printf("Média: %lf\n", media);
    
    if (media < 7) {
        printf("Reprovado\n");
    } else if (media <= 9.9) {
        printf("Aprovado\n");
    } else {
        printf("Aprovado com distinção\n");
    }
}
