#include <stdio.h>

int main() {
    float n1;
    float n2;
    float media;
    char nome[20];
    char sobrenome[20];

    printf("Digite o seu nome: ");
    scanf("%s%s", nome, sobrenome);

    printf("Digite a primeira nota: ");
    scanf("%f", &n1);
    
    while (n1 < 0 || n1 > 10) {
        printf("Digite a nota novamente\n");
        printf("Digite a primeira nota: ");
        scanf("%f", &n1);
    }
    
    printf("Digite a segunda nota: ");
    scanf("%f", &n2);
    
     while (n2 < 0 || n2 > 10) {
        printf("Digite a nota novamente\n");
        printf("Digite a segunda nota: ");
        scanf("%f", &n2);
    }

    media = (n1 + n2) / 2;
    printf("Média: %f\n", media);

    if (media >= 7 && media < 10) {
        printf("Parábens, %s %s você passou!", nome, sobrenome);
    } else if (media < 7 && media >= 0) {
        printf("%s %s vocễ não passou!", nome, sobrenome);
    } else {
        printf("Parabéns, %s %s você passou com exceção", nome, sobrenome); 
    }
    printf("\n");
}
