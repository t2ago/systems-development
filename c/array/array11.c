#include <stdio.h>
#include <locale.h>
#include <time.h>

#define TAM 6

int main () {
	setlocale(LC_ALL, "");
	
	int i;
	int valor[TAM];

	for (i = 0; i < TAM; i++) {
		
		do {
	        system("cls||clear");
	        printf("Digite o %dº valor: ", i + 1);
	        scanf("%d",&valor[i]);
	        
	        if (valor[i] <= 0 || valor[i] % 2 != 0) {
	        	printf("Número inválido!");
	        	sleep(4);
			}
			
        } while (valor[i] <= 0 || valor[i] % 2 != 0);
		
	}

	system("cls||clear");	
	printf("=== Exibindo resultados ===\n");
	
	for (i = 5; i >=0; i--) {
		printf("%dº valor: %d\n", i + 1, valor[i]);
	}
	
 return 0;	
}
		
