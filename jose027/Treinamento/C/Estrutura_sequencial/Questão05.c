#include <stdio.h>

int main() {
    int metros;

    printf("Digite a medida em metros: ");
    scanf("%i", &metros);

    float centimetros = metros / 100; 

    printf("%im = %fcm\n", metros, centimetros);
}
