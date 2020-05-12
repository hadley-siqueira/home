#include <stdio.h>

int main() {
    double salario;
    int r;
    
    printf("Digite o salário do colaborador: R$");
    scanf("%lf", &salario);

    if (salario <= 280) {
        r = 20;
    } else if (salario > 280 && salario <= 700) {
        r = 15;
    } else if (salario > 700 && salario < 1500) {
        r = 10; 
    } else {
        r = 5;
    }

    double novo_salario = salario + (salario * r / 100);
    
    printf("Salário antes do reajuste: R$%lf reais\n", salario);
    printf("Reajuste: %i\n", r);
    printf("Valor do aumento: R$%lf reais\n", novo_salario - salario);
    printf("Salário pós-reajuste: R$%lf reais\n", novo_salario);
}
