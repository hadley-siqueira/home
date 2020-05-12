#include <stdio.h>

char verificacaoNumero(int n) {
    if (n % 2 == 0) {
        return "true";
    } else {
        return "false";
    }   
}

int main() {
    int n;
    printf("Digite o número esejado: ");
    scanf("%i", &n);

    printf("%s\n",verificacaoNumero(n));
}
