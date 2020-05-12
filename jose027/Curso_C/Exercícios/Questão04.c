#include <stdio.h>

int main() {

    printf("*** Conta ***\n");

    float subtotal;
    printf("Digite o subtotal: ");
    scanf("%f", &subtotal);

    float comissao = subtotal * 0.1;
    float total = subtotal + comissao;

    printf("Subtotal: R$%f\n", subtotal);
    printf("Comissão: R$%f\n", comissao);
    printf("Total: R$%f\n", total);
}
