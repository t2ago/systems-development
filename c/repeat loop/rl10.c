#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i, numeros, pares = 0, impares = 0;
	
	for(i = 0; i < 5; i++) {
		printf("Digite cinco números inteiros:");
	    scanf("%d",&numeros);
	
        if(numeros % 2 == 0) {
	   	 pares++;
	   } else {
	   	 impares++;
	   } 
    } 
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Quantidade de números pares: %d\n", pares);
	printf("Quantidade de números impares: %d\n", impares);
	
	return 0;
}
