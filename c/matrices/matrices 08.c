#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>

int main() {
	setlocale (LC_ALL, "");
	
	char disciplinas[3][200];
    float notas[3][2], media[3], soma = 0, multiplicar;
    int peso[3] = {3,3,4};
	int i, j;
	
	
	for(i = 0; i < 3; i++) {
		system("cls||clear");
		printf("Digite o nome da %iº disciplina: ", i+1);
		scanf("%s", &disciplinas[i]);
		
	    for (j = 0; j < 3; j++) {
			do {
	            printf("Digite a %iª nota: ", j + 1);
			    scanf("%f", &notas[i][j]);
				
			    if (notas[i][j] < 0 || notas[i][j] > 10) {
			       	printf("Nota inválida!\n");
			    	sleep(2);
		    	} 
		    	
			} while (notas[i][j] < 0 || notas[i][j] > 10);
			
			multiplicar = notas[i][j] * peso[j];
		    soma += multiplicar;
			media[i] = soma / 10;
	    }
		
	soma = 0;
		
	}
	
	system("cls||clear");		
	printf("=== Exibndo dados ===\n");	
	for (i = 0; i < 3; i++) {
		printf("%dº Disciplina: %s \n", i+1, disciplinas[i]);
			
	for (j = 0; j < 3; j++) {
		printf("%dª Nota: %.1f \n", j+1, notas[i][j]);
	}
	
	printf("Média: %.1f\n", media[i]);
	printf("\n");		
	}
		
	
	return 0;
	
}
