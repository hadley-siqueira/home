#include <stdio.h>

int main() {
    double ganho_horario;
    int hora_dia;

    printf("Digite o seu ganho horário: ");
    scanf("%lf", &ganho_horario);

    printf("Digite a sua jornada diária: ");
    scanf("%i", &hora_dia);

    double s_bruto = ganho_horario * hora_dia * 20;
    double ir = s_bruto * 0.11;
    double inss = s_bruto * 0.08;
    double sindicato = s_bruto * 0.05;

    printf("Salário bruto: R$%lf reais\n", s_bruto);
    printf("Imposto de renda: R$%lf reais\n", ir); 
    printf("INSS: R$%lf reais\n", inss); 
    printf("sindicato R$%lf reais\n", sindicato); 
    printf("Salário líquido: R$%lf reais\n", s_bruto - ir - inss - sindicato); 
}
