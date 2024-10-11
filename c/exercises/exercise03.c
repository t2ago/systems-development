#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "portuguese");
	
	int numero;
	
	printf("Digite um número: ");
	scanf("%i",&numero);
	
	printf("=== Exibindo resultados ===\n");
	
	if (numero % 2 == 0) {
		printf("Par.");
	} else {
		printf("Ímpar.");
	}
	
	return 0;
}
