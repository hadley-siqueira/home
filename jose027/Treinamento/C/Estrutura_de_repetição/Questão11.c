#include <stdio.h>

int main() {
    //Opções de voto
    int jose = 0;
    int joao = 0;
    int gustavo = 0;
    int fabiano = 0;
    int branco = 0;
    int nulo = 0;
    //Vetores das opções
    char nomes[6][10] = {"José", "João", "Gustavo", "Fabiano", "Branco", "Nulo"};
    int candidatos[6] = {jose, joao, gustavo, fabiano, branco, nulo};
    int votos[6] = {1, 2, 3, 4, 5, 6};

    printf("*** Candidatos ***\n");
    printf("1-José\n2-João\n3-Gustavo\n4-Fabiano\n5-Branco\n6-Nulo\n");
   
    int opcao = -1;
    int qtd_votos = 0;
    while (opcao != 0) {
        for (int c = 0; c < 6; c++) {
            if (opcao == votos[c]) {
                candidatos[c] += 1;
                break;
            }
        }
        printf("Digite a opção de voto: ");
        scanf("%i", &opcao);
        while (opcao < 0 || opcao > 6) {
            printf("A opção digitada não está disponível na eleição, digite novamente\n");
            printf("Digite a opção de voto: ");
            scanf("%i", &opcao);
        }
        if (opcao != 0) {
            qtd_votos += 1;
        }
    }
 
    double p_nulos = candidatos[4] * 100 / qtd_votos; 
    double p_brancos = candidatos[5] * 100/ qtd_votos;
    
    printf("Resultado final: \n");
    for (int c = 0; c < 6; c++) {
        printf("%s: %i\n", nomes[c], candidatos[c]);
    }
    printf("Porcentagem de votos nulos: %lf\nPorcentagem de votos brancos: %lf\n", p_nulos, p_brancos);
}
