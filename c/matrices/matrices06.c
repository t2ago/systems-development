#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main() {
	setlocale (LC_ALL, "");
	
	char disciplinas[3][200];
    float notas[2][3], media[3], soma = 0;
	int i, j;
	
	
	for(i = 0; i < 3; i++) {
		system("cls||clear");
		printf("Digite o nome da %i� disciplina: ", i+1);
		scanf("%s", &disciplinas[i]);
		
	for (j = 0; j < 2; j++) {
	printf("Digite a %i� nota: ", j + 1);
			scanf("%f", &notas[i][j]);
		
			soma += notas[i][j];
	}
		
	media[i] = soma / 2;
	soma = 0;
		
	}
	
	system("cls||clear");		
	printf("=== Exibndo dados ===\n");	
	for (i = 0; i < 3; i++) {
		printf("%d� Disciplina: %s \n", i+1, disciplinas[i]);
			
	for (j = 0; j < 2; j++) {
		printf("%d� Nota: %.1f \n", j+1, notas[i][j]);
	}
	
	printf("M�dia: %.1f\n", media[i]);
	
	if (media[i] >= 7) {
		printf("Aprovado!\n");
	} else if (media[i] >= 5) {
		printf("Recupera��o!\n");
	} else {
		printf("Reprovado!\n");
	}
	
	printf("\n");	
			
	}
		
	
	return 0;
	
}
