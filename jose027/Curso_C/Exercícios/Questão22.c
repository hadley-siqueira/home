#include <stdio.h>
#include <math.h>

void conversaoCelsius() {
    float farenheit;

    printf("Digite a temperatura em farenheit: ");
    scanf("%f", &farenheit);

    float celsius = (farenheit - 32) * 5 / 9;
    printf("Celsius: %f\n°", celsius);   
}

int main() {
    conversaoCelsius();
}
