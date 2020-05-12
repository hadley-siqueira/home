#include <stdio.h>

struct hora {
    int hora;
    int minuto;
    int segundo;
};

struct hora impressaoEstrutura(struct hora x) {
    printf("%i:%i:%i\n", x.hora, x.minuto, x.segundo);
    return x;
}

struct hora manipulacaoEstrutura(struct hora x) {
    x.hora = x.hora + 10;
    if (x.hora >= 24) {
        x.hora -= 24;
    }
    
    x.minuto = x.minuto + 20;
    if (x.minuto >= 60) {
        x.minuto -= 60;
    } 
    
    x.segundo = x.segundo + 30;
    if (x.segundo >= 60) {
        x.segundo -= 60;
    }

    printf("%i:%i:%i\n", x.hora, x.minuto, x.segundo);
    return x;
}

int main() {
    struct hora agora;
        agora.hora = 10;
        agora.minuto = 42;
        agora.segundo = 49;

    struct hora teste = impressaoEstrutura(agora);
    struct hora teste2 = manipulacaoEstrutura(agora);
    
}

       
