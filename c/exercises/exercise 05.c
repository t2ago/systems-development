#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "");
	
	float salario, salariosMinimos;
	
	printf("Digite o seu salário: ");
	scanf("%f",&salario);
	
	salariosMinimos = salario / 1412;
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Salário: %3.f \n", salario);
	printf("Salarios mínimos: %f \n", salariosMinimos);
	
	return 0;
}
