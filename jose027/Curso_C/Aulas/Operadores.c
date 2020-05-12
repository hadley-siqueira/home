#include <stdio.h>

/*
O algoritmo receberá as idade abaixo
somá-las e após a soma mostrá-las
abaixo cada idade e a soma
*/

int main() {
    
    printf("*** Idades *** \n");
    
    int minhaIdade = 16;//minha idade
    int idadeMae = 42;//idade da minha mãe
    int idadePai = 36;//idade do meu Pai
    int somaIdades = minhaIdade + idadeMae + idadePai;
    
    printf("Minha idade é %i \n", minhaIdade);
    printf("A idade da minha mãe é %i \n", idadeMae);
    printf("A idade do meu pai é %i \n", idadePai);
    printf("A soma de todas as idades é %i \n", somaIdades); 
}
