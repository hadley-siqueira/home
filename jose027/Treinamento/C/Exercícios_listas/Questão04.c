#include <stdio.h>
#include <string.h>

int main() {
    char caracteres[10][1];
    char vogais[10][2] = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
    int qtd_vogais = 0; 

    for (int c = 0; c < 10; c++) {
        printf("Digite o %i° caractere: ", c + 1);
        scanf("%s", caracteres[c]);
    }

    for (int c = 0; c < 10; c++) {
        for (int contad = 0; contad < 10; contad++) {
            if (strncmp(caracteres[c], vogais[c], 1)) {
                qtd_vogais += 1;
                break;
            }
        }
    }
    printf("Quantidade de consoantes digitadas: %i\n", 10 - qtd_vogais);
}
