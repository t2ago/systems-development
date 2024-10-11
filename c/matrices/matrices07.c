#include <stdio.h>
#include <locale.h>
#include <stdlib.h>

int main() {
	setlocale (LC_ALL, "");
	
	char bandas[3][200];
	char integrantes[3][5][200];
	int i, j;
	
	for (i = 0; i < 3; i++) {
		printf("Digite o nome da %dª banda: ", i + 1);
		scanf("%s",&bandas[i]);
		
		for (j = 0; j < 5; j++) {
			printf("Digite o nome do %dº integrante: ", j + 1);
			scanf("%s",&integrantes[i][j]);
		}
		
		printf("\n");
	}
	
	system("cls||clear");		
	printf("=== Exibindo dados ===\n");
	
	for (i = 0; i < 3; i++) {
		printf("%dª banda: %s\n", i + 1, bandas[i]);
	
	    for (j = 0; j < 5; j++) {
		printf("%dº integrante: %s\n", j + 1, integrantes[i][j]);
	    }
	    
	    printf("\n");
    }
	
 return 0;	
}
