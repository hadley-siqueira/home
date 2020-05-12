#include <stdio.h>

int main() {
    struct horario {
        int hora; 
        int minutos; 
        int segundos;
    };

    struct horario teste[2] = {{12,30,33},{19,45,51}};

    for (int c = 0; c < 2; c ++) {
        printf("*** Hora ***\n");
        printf("%i:%i:%i\n", teste[c].hora, teste[c].minutos, teste[c].segundos);
    }
}
