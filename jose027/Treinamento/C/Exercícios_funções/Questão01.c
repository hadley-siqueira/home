#include <stdio.h>

int soma(int n1, int n2, int n3) {
    return n1 + n2 + n3;
}

int main() {
    int n1, n2, n3;
    
    printf("Digite o primeiro número: ");
    scanf("%i", &n1);
    
    printf("Digite o segundo número: ");
    scanf("%i", &n2);
    
    printf("Digite o terceiro número: ");
    scanf("%i", &n3);

    printf("Soma: %i\n", soma(n1, n2, n3));
}
