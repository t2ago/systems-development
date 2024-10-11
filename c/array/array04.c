#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define TAM 5

int main () {
	setlocale(LC_ALL, "");
	
	float vetor[TAM];
	int i;
	
	printf("Digite três notas: \n");
	for (i = 0; i < 3; i++) {
		printf("Digite a %dª nota: ", i + 1);
		scanf("%f",&vetor[i]);
		
		vetor[4] += vetor[i];
	}
	
	vetor[5] = vetor[4] / i;
	
	system("cls||clear");
	printf("Exibindo resultados\n");
	for (i = 0; i < 3; i++) {
		printf("%dª nota: %.1f \n", i + 1, vetor[i]);
	}
	
	printf("\nMédia: %.1f \n", vetor[5]);
	if (vetor[5] >= 7) {
		printf("Aprovado!");
	} else if(vetor[5] >= 5) {
		printf("Recuperação!");
	} else {
		printf("Reprovado!");
	}
	
 return 0;	
}
	
	
	
	
