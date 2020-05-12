#include <stdio.h> 

int main() {
    int n1, n2, n3;

    printf("Digite o primeiro número: ");
    scanf("%i", &n1);
    printf("Digite o segundo número: ");
    scanf("%i", &n2);
    printf("Digite o terceiro número: ");
    scanf("%i", &n3);

    printf("O quadrado de %i é %i\n", n1, n1* n1); 
    printf("O triplo de %i é %i\n", n2, n2 * 3); 
    printf("O quatuplo de %i é %i\n", n3, n3 * 4); 
}
