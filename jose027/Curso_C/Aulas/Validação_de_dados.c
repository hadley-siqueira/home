#include <stdio.h>

/*
Esse algoritmo irá ler os dados
digitados pelo usuário, em seguida
calculará a área de um retângulo
*/

int main() {
      
    int base, altura;//Declaração das variáveis "base" e "altura"

    printf("Digite a base: ");
    scanf("%i", &base);//Validação do valor digitado pelo usuário

    printf("Digite a altura: ");
    scanf("%i", &altura);//Validação do valor digitado pelo usuário

    int area = base * altura;//Declaração da variável "area" e seu cálculo

    printf("Área: %i cm²\n", area);

}
