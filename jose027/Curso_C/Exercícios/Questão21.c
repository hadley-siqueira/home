#include <stdio.h>
#include <math.h>

float areaQuadrado(float l) {
    float area = pow(l, 2);
    return area;    
}

int main() {
    printf("*** Calculo da área de um quadrado ***\n");
    float lado;
    
    printf("Digite o lado do quadrado: ");
    scanf("%f", &lado);

    float calculo = areaQuadrado(lado); 
    printf("%fm²\n", calculo);
}
