#include <stdio.h>

/*
Este algoritmo irá mostrar a hora onsiderada "atual"
e depois mostrará a hora coniderada "atualizada"
*/

int main() {

    struct Tempo {
        int hora;
        int minutos;
        int segundos;
    };

    struct Tempo agora;
        agora.hora = 15;
        agora.minutos = 45;
        agora.segundos = 30;

    struct Tempo depois;
        depois.hora = agora.hora + 1;

        if (depois.hora >= 24) {
            depois.hora -= 24;
        }
        
        depois.minutos = agora.minutos + 29;
        
        if (depois.minutos >= 60) {
            depois.minutos -= 60;
        }
        
        depois.segundos = agora.segundos + 30;
        
        if (depois.segundos >= 60) { 
            depois.segundos -= 60;
        }

    printf("*** Hora atual ***\n");
    printf("%i:%i:%i\n", agora.hora, agora.minutos, agora.segundos);
   
    printf("*** Hora atualizada ***\n");
    printf("%i:%i:%i\n", depois.hora, depois.minutos, depois.segundos);
}
