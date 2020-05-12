#include <stdio.h>
#include <math.h>

int main() {
    int n1, n2;
    double n3;

    printf("Digite o primeiro número: ");
    scanf("%i", &n1);

    printf("Digite o segundo número: ");
    scanf("%i", &n2);

    printf("Digite o terceiro número: ");
    scanf("%lf", &n3);

    printf("%i\n", n1 * 2 * (n2 / 2));
    printf("%f\n", n1 * 3 + n3);
    printf("%lf\n", pow(n3, 3));
}
