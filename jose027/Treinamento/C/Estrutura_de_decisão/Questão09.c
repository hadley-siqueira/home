#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;

    printf("a: ");
    scanf("%i", &a);

    printf("b: ");
    scanf("%i", &b);

    printf("c: ");
    scanf("%i", &c);

    double delta = pow(b, 2) - (4 * a * c); 

    if (delta > 0) {
        printf("x1 = %lf\n", -b - sqrt(delta) / 2 * a);
        printf("x2 = %lf\n", -b + sqrt(delta) / 2 * a);
    } else if (delta < 0) {
        printf("A equação não apresenta raíz quadrada\n");
    } else {
        printf("x = %lf\n", -b - sqrt(delta) / 2 * a);
    }
}
