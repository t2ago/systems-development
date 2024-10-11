#include <stdio.h>
#include <locale.h>

#define TAM 10

int main () {
	setlocale(LC_ALL, "");
	
	int i;
	float numero[TAM];
	float soma = 0, negativo;
	
	for (i = 0; i < TAM; i++) {
		system("cls||clear");
		printf("Digite o %dº número: ", i + 1);
		scanf("%f",&numero[i]);
		
		if (numero[i] > 0) {
			soma += numero[i];
		} else if (numero[i] < 0) {
			negativo++;
		}
	}
	
	system("cls||clear");
	printf("=== Exibindo resultados ====\n");
	printf("Quantidade de números negativos: %.1f \n", negativo);
	printf("Soma dos números positivos: %.1f ", soma);
	
 return 0	;
}
