#include <stdio.h>

int main() {
    int base, expoente;

    printf("Digite a base: ");
    scanf("%i", &base);

    printf("Digite o expoente: ");
    scanf("%i", &expoente);
    
    int resultado = 1;
    for (int c = 0; c < expoente; c++) {
        resultado *= base;
    }
    printf("Resultado: %i\n", resultado);
}
