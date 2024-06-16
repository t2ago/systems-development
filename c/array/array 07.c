#include <stdio.h>
#include <locale.h>

#define TAM 6

int main () {
	setlocale(LC_ALL, "");
	
	int numeros[TAM], pares = 0, impares = 0;
	int i;
	
	for (i = 0; i < TAM; i++) {
		printf("Digite o %dº número: ", i + 1);
		scanf("%d",&numeros[i]);
		
		if (numeros[i] % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
	}
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	
	for (i = 0; i < TAM; i++) {
		printf("%dº número: %d \n", i + 1, numeros[i]);
	}
	
	printf("\nQuantidade pares: %d \n", pares);
	printf("Quantidade impares: %d", impares);
	
 return 0;	
}
