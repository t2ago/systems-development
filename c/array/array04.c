#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define TAM 5

int main () {
	setlocale(LC_ALL, "");
	
	float vetor[TAM];
	int i;
	
	printf("Digite tr�s notas: \n");
	for (i = 0; i < 3; i++) {
		printf("Digite a %d� nota: ", i + 1);
		scanf("%f",&vetor[i]);
		
		vetor[4] += vetor[i];
	}
	
	vetor[5] = vetor[4] / i;
	
	system("cls||clear");
	printf("Exibindo resultados\n");
	for (i = 0; i < 3; i++) {
		printf("%d� nota: %.1f \n", i + 1, vetor[i]);
	}
	
	printf("\nM�dia: %.1f \n", vetor[5]);
	if (vetor[5] >= 7) {
		printf("Aprovado!");
	} else if(vetor[5] >= 5) {
		printf("Recupera��o!");
	} else {
		printf("Reprovado!");
	}
	
 return 0;	
}
	
	
	
	
