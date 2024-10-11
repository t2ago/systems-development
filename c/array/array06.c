#include <stdio.h>
#include <limits.h>
#include <locale.h>

#define TAM 6

int main () {
	setlocale(LC_ALL, "");
	
	int numero[TAM];
	int maior = INT_MIN, menor = INT_MAX, pares, impares;
	int i;
	
	printf("Digite 5 números:\n");
	for (i = 0; i < TAM; i++) {
		printf("Digite o %dº número: ", i + 1);
		scanf("%d",&numero[TAM]);
	
	    if(numero[i] % 2 == 0) {
	   	 pares++;
	   } else {
	   	 impares++;
	   }

	}
	
	printf("Números pares: %d\n", pares);
	printf("Números impares: %d\n", impares);
	
 return 0;
}
