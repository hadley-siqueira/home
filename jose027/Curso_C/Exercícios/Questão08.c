#include <stdio.h>

int main() {
    int cons;
    
    printf("Digite o seu consumo mensal: ");
    scanf("%i", &cons);

    if (cons >= 0 && cons <= 19) {
        printf("Preço a pagar: R$8.50 reais\n");
    } else {
        printf("Preço a pagar: R$20.00 reais\n");
    }
}
