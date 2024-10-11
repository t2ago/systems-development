#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "");
	
	float valor, reajuste = 0.9, valorFinal;
	
	printf("Digite um número: ");
	scanf("%f",&valor);
    
    valorFinal = valor * reajuste;
    
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Valor: %.2f \n", valor);
	printf("Valor com desconto: %.2f \n", valorFinal);
	
	return 0;
}
