#include <stdio.h>

int main() {
    char produto1[100], produto2[100], produto3[100];
    double preco1, preco2, preco3;
    
    printf("Digite o nome do primeiro produto: ");
    scanf("%s", produto1);
    printf("Digite o preço do primeiro produto: ");
    scanf("%lf", &preco1);
    
    printf("Digite o nome do segundo produto: ");
    scanf("%s", produto2);
    printf("Digite o preço do segundo produto: ");
    scanf("%lf", &preco2);
    
    printf("Digite o nome do terceiro produto: ");
    scanf("%s", produto3);
    printf("Digite o preço do terceiro produto: ");
    scanf("%lf", &preco3);

    if (preco1 < preco2 && preco1 < preco3) {
        printf("Produto sugerido para compra: %s\n", produto1);
    } else if (preco2 < preco1 && preco2 < preco3) {
        printf("Produto sugerido para compra: %s\n", produto2);
    } else if (preco3 < preco1 && preco3 < preco2) {
        printf("Produto sugerido para compra: %s\n", produto3);
    }
}
