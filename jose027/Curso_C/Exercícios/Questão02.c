#include <stdio.h>

int main() {
    int horas;
    
    printf("Digite as horas desejadas: ");
    scanf("%i", &horas);

    float dias = horas / 24.0;
    
    printf("%f dias\n", dias);

}
