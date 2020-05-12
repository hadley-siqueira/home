#include <stdio.h>
#include <math.h>

int main() {
    
    int peso;
    printf("Digite o seu peso: ");
    scanf("%i", &peso);
    
    float altura;
    printf("Digite a sua altura: ");
    scanf("%f", &altura);

    float imc = peso / pow(altura, 2);

    printf("IMC: %f\n", imc);

    if (imc < 18.5) {
        printf("Vocẽ está abaixo do peso");
    } else if (imc >= 18.5 && imc < 25) {
        printf("Você está com o peso normal");
    } else if (imc >= 25 && imc < 30) {
        printf("Você está acima do peso");
    } else {
        printf("Você está acima do peso");
    }
    printf("\n");
}
