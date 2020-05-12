#include <stdio.h>

int main() {
    char nome[20];
    char sobrenome[20];
    double soma = 0.0;
    double notas[7];
    

    printf("Nome do atleta: ");
    scanf("%s%s", nome, sobrenome);

    for (int c = 0; c < 7; c++) {
        printf("Digite a %i° nota: ", c + 1);
        scanf("%lf", &notas[c]);
        soma += notas[c];
    }

    for (int c = 0; c < 7; c++) {
        if (notas[c] < notas[0]) {
            notas[0] = notas[c];
        } else if (notas[c] > notas[6]) {
            notas[6] = notas[c];
        }
    }
  
    printf("\nResultado final:\n");
    printf("Atleta: %s %s\n", nome, sobrenome);
    printf("Média: %lf\n", soma / 7.0);
    printf("Melhor nota: %lf\nPior nota: %lf\n", notas[6], notas[0]);
}
