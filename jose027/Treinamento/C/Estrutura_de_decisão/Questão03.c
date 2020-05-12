#include <stdio.h>

int main() {
    char l;

    printf("Digite a primeira letra do sexo desejado: ");
    scanf("%c", &l);

    if (l == 'M' || l == 'm') {
        printf("Sexo digitado: masculino\n"); 
    } else if (l == 'F' || l == 'f') {
        printf("Sexo digitado: feminino\n");
    } else {
        printf("Sexo digitado inválido\n");
    }
}
