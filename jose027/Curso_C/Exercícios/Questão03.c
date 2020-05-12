#include <stdio.h>

int main() {
    
    printf("*** Cálculo de IMC ***\n");
    
    float altura, peso;

    printf("Digite a altura desejada: ");
    scanf("%f", &altura);
    
    printf("Digite o peso desejado: ");
    scanf("%f", &peso);
    
    float imc = peso / (altura * altura);

    printf("IMC: %f\n", imc);
}
