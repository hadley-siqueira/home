#include <stdio.h>

int main() {
    double medias[10], nota;
    
    for (int c = 0; c < 10; c++) {
        double soma = 0;
        printf("*** %i° aluno ***\n", c + 1);
        for (int cont = 0; cont < 4; cont++) {
            printf("Digite a %i° nota: ", cont + 1);
            scanf("%lf", &nota);
            soma += nota;
        }
        double media = soma / 4.0;
        medias[c] = media; 
        printf("Média: %lf\n", media);
    }

    int a_media = 0;
    for (int c = 0; c < 10; c++) {
        if (medias[c] > 7.0) {
            a_media++;
        }
    }
    printf("Quantidade de alunos acima da média: %i alunos\n", a_media);
}
