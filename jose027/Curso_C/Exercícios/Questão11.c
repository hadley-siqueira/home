#include <stdio.h>
#include <math.h>

int main() {
    printf("*** Equação do 2°grau ***\n");
    int a;
    int b;
    int c;

    printf("a: ");
    scanf("%i", &a);
    
    printf("b: ");
    scanf("%i", &b);
    
    printf("c: ");
    scanf("%i", &c);

    int delta = pow(b, 2) - (4 * a * c);
    printf("Delta = %i\n", delta);

    if (delta < 0) {
        printf("A equação não tem nenhuma raíz");
    printf("\n");
    } else {
        if (delta == 0) {
            printf("A equação tem uma raíz");
        } else {
            printf("A equação tem duas raízes");
    } 
    printf("\n");

        float raiz1 = -b + sqrt(delta) / (2 * a);
        float raiz2 = -b - sqrt(delta) / (2 * a);

        if (raiz1 == raiz2) {
            printf("X = %f", raiz1);
        } else {
            printf("X¹ = %f\n", raiz1);
            printf("X² = %f", raiz2);
        }
        printf("\n");
    }
}
