#include <stdio.h>
#include <limits.h>
#include <locale.h>

#define TAM 5

int main () {
	setlocale(LC_ALL, "");
	
	int numero[TAM];
	int maior = INT_MIN, menor = INT_MAX;
	int i;
	
	printf("Digite 5 n�meros:\n");
	for (i = 0; i < TAM; i++) {
		printf("Digite o %d� n�mero: ", i + 1);
		scanf("%d",&numero[i]);
	
		if (numero[i] > maior) {
			maior = numero[i];
		}
		
		if (numero[i] < menor) {
			menor = numero[i];
		}
	}
	
	printf("Maior n�mero: %d\n", maior);
	printf("Menor n�mero: %d\n", menor);
	
 return 0;
}
