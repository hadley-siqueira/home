#include <stdio.h>

int main() {

    printf("*** Preço de um veículo ***\n");

    float preco_fabrica;
    printf("Digite o preço de fábrica: ");
    scanf("%f", &preco_fabrica);
   
    int p_lucro, p_imposto;

    printf("Digite o percentual de lucro: ");
    scanf("%i", &p_lucro);
    
    printf("Digite o percentual de imposto: ");
    scanf("%i", &p_imposto);

    float lucro = preco_fabrica * p_lucro / 100;
    float imposto = preco_fabrica * p_imposto / 100;
    float preco_total = lucro + imposto + preco_fabrica;

    printf("R$%f Reais\n", lucro);
    printf("R$%f Reais\n", imposto);
    printf("R$%f Reais\n", preco_total);
    
}
