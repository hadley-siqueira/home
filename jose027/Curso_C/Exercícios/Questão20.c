#include <stdio.h>

void verificacaoNumero() {
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    bool r = n % 2 == 0 ?printf("true\n"):printf("false\n");
} 

int main() {
    printf("*** Verificação de número ***\n");
    verificacaoNumero();
    
}
