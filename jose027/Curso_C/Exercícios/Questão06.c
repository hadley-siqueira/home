#include <stdio.h>
#include <math.h>

int main() {
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    if (n < 0) {
        n *= n;
        printf("%i", n);
    } else if (n == 0) {
        printf("%i", n);
    } else {
        int raiz_quadrada = sqrt(n);
        printf("%i", raiz_quadrada); 
    }
    printf("\n");
}
