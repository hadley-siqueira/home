#include <stdio.h>

int main() {
    printf("*** Validação de strings ***\n");
    
    char nome[20];
    char sobrenome[20];

    printf("Digite o nome completo: ");
    scanf("%s%s", nome, sobrenome);

    printf("%s %s\n", nome, sobrenome);
}
