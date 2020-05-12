#include <stdio.h>
#include <math.h>

/*
Esse algoritmo pede dois dados 
dos usuário (altura e massa),
calcula o IMC e verifica como o
estado de índice de massa 
corporal do usuário pode ser
classificado
*/

void verificarEstado(double imc) {
    printf("IMC: %lf\n", imc);
    if (imc < 16) {
        printf("Magreza extrema");
    } else if (imc >= 16 && imc < 17) {
        printf("Magreza moderada");
    } else if (imc >= 17 && imc < 18.5) {
        printf("Magreza leve");
    } else if (imc >= 18.5 && imc < 25) {
        printf("Saudável");
    } else if (imc >= 25 && imc < 30) {
        printf("Sobrepeso");
    }printf("\n");
}

double calcularImc(double altura, double massa) {
    double imc = massa / pow(altura, 2);    
    verificarEstado(imc);
    return imc;
}

int main() {
    double altura, massa;
    
    printf("Digite a sua altura: ");
    scanf("%lf", &altura);
    
    printf("Digite a sua massa: ");
    scanf("%lf", &massa);

    calcularImc(altura, massa);
}
