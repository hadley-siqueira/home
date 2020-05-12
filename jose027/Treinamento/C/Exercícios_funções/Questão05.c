#include <stdio.h>

void converterTempo(int s) {
    int horas;
    horas = s / 3600;
    int minutos; 
    minutos = (s % 3600) / 60;
    int segundos = s - ( minutos * 60  +  horas * 3600);
    printf("%i hora:%i minutos:%i segundos\n", horas, minutos, segundos);
}

int main() {
    int segundos;
    printf("Digite os segundos desejados: ");   
    scanf("%i", &segundos);
    converterTempo(segundos); 
}
