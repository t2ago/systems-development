#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i, numeros, pares = 0, impares = 0;
	
	for(i = 0; i < 5; i++) {
		printf("Digite cinco n�meros inteiros:");
	    scanf("%d",&numeros);
	
        if(numeros % 2 == 0) {
	   	 pares++;
	   } else {
	   	 impares++;
	   } 
    } 
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Quantidade de n�meros pares: %d\n", pares);
	printf("Quantidade de n�meros impares: %d\n", impares);
	
	return 0;
}
