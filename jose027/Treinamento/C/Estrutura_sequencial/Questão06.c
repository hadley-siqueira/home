#include <stdio.h>
#include <math.h>

int main() {
    const float pi = 3.1416;
    float raio;

    printf("Digite o valor do raio; ");
    scanf("%f", &raio);

    printf("Área do´círculo: %fcm²\n", pi * pow(raio, 2));    
}
