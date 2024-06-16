#include <stdio.h>
#include <limits.h>
#include <locale.h>

#define TAM 5

int main () {
	setlocale(LC_ALL, "");
	
	int numero[TAM];
	int maior = INT_MIN, menor = INT_MAX;
	int i;
	
	printf("Digite 5 números:\n");
	for (i = 0; i < TAM; i++) {
		printf("Digite o %dº número: ", i + 1);
		scanf("%d",&numero[i]);
	
		if (numero[i] > maior) {
			maior = numero[i];
		}
		
		if (numero[i] < menor) {
			menor = numero[i];
		}
	}
	
	printf("Maior número: %d\n", maior);
	printf("Menor número: %d\n", menor);
	
 return 0;
}
