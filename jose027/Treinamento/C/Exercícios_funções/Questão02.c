#include <stdio.h>

char verificacaoNumero(int n) {
    if (n >= 0) {
        return 'P';
    } else {
        return 'N';
    }
}

int main() {
    int n;

    printf("Digite o número desejado: ");
    scanf("%i", &n);

    printf("%c\n", verificacaoNumero(n));
}
