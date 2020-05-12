#include <stdio.h>
#include <math.h>

int main() {
    float lado;

    printf("Digite a medida do lado do quadrado: ");
    scanf("%f", &lado);

    printf("Área: %fcm * %fcm = %fcm² * 2 = %f\n", lado, lado, pow(lado, 2), pow(lado, 2) * 2);    
}

