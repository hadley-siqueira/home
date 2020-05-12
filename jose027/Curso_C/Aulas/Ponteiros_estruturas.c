#include <stdio.h>
/*
Esse algoritmo irá criar uma 
estrutura que represente um relógio
com ponteiros
*/

int main() {

    struct horario {
        int *pHora;
        int *pMinuto;
        int *pSegundo;
    };

struct horario hoje;
int hora = 20;
int minuto = 30;
int segundo = 20;

hoje.pHora = &hora;
hoje.pMinuto = &minuto;
hoje.pSegundo = &segundo;
printf("Hora: %i horas\n", *hoje.pHora);  
printf("Minutos: %i minutos\n", *hoje.pMinuto);  
printf("Segundos: %i segundos\n", *hoje.pSegundo);  
}
