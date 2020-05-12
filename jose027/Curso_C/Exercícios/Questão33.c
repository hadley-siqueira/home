#include <stdio.h>

/*
Esse algoritmo irá pedir a 
quantidade de certidões e
casamentos realizados pelo
cartório e irá mostrar o valor
faturado pelo cartório de acordo
com os números digitados 
pelo usuário
*/

int main() {
    printf("*** Cartório ***\n");
    
    int qtd_certidoes, qtd_casamentos;

    printf("Digite a quantidade de certidões: ");
    scanf("%i", &qtd_certidoes);
    
    printf("Digite a quantidade de casamentos: ");
    scanf("%i", &qtd_casamentos);

    float total = (qtd_certidoes * 30) + (qtd_casamentos * 250);

    printf("Total: R$%f reais\n", total);
}
