#include <stdio.h>

int main() {
    int n;
    
    printf("Digite o número desejado: ");
    scanf("%i", &n);

    if (n % 6 == 0) {
        printf("O número %i é divísivel por 6\n", n);
    } else {
        printf("O número %i não é divísivel por 6\n", n);
    }
}
