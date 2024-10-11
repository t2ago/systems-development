#include <stdio.h>
#include <locale.h>

#define TAM 5

int main () {
	setlocale(LC_ALL, "");
	
	int i;
	int numero[TAM];
	
	for (i = 0; i < TAM; i++) {
		system("cls||clear");
		printf("Digite o %dº número: ", i + 1);
		scanf("%d",&numero[i]);
		
	if (numero[i] < 0) {
			numero[i] = 0;
		}
    }
    
    system("cls||clear");
	printf("=== Exibindo resultados ====\n");
	
	for (i = 0; i < TAM; i++) {
		printf("%dº número: %d\n", i + 1, numero[i]);
	}
	
 return 0	;
}
