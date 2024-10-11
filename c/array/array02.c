#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main () {
	setlocale(LC_ALL, "");
	
	int vetor[3];
	int i;
	
	printf("Digite três notas: \n");
	for (i = 0; i < 3; i++) {
		printf("Digite a %dª nota: ", i + 1);
		scanf("%d",&vetor[i]);
		fflush(stdin);
	}
	
	printf("\nExibindo resultados\n");
	for (i = 0; i < 3; i++) {
		printf("%dª nota: %d\n", i + 1, (float)vetor[i]);
	}
	
 return 0;	
}
	
	
	
	
