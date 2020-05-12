#include <stdio.h>

int main() {
    struct horario {
        int hora;
        int minutos;
        int segundos;
    };

    struct horario teste[1];
    teste[0].hora = 13;
    teste[0].minutos = 40;
    teste[0].segundos = 53;

    printf("*** Hora ***\n");    
    printf("%i:%i:%i\n", teste[0].hora, teste[0].minutos, teste[0].segundos);
}
