#include <stdio.h>

int main() {
    double ganho_horario;
    int horas_dia;

    printf("Digite o seu ganho horário: ");
    scanf("%lf", &ganho_horario);

    printf("Digite sua jornada diária: ");
    scanf("%i", &horas_dia);

    printf("Salário: R$%lf reais\n", ganho_horario * horas_dia * 20);
}
