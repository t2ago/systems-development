#include <stdio.h>
#include <locale.h>
#include <ctype.h>

int main() {
    setlocale(LC_ALL, "");

    int i, qtdGeral = 0, qtdPares = 0;
    int numeros, qtdImpares = 0, somaPares = 0, somaGeral = 0;
    
    while (1) {
    	printf("Digite um n�mero inteiro: ");
	    scanf("%d",&numeros);
	    
	    if (numeros == 0) {
            break;
        }
	    
	    if(numeros % 2 == 0) {
	     somaPares += numeros;
	   	 qtdPares++;
	   } else {
	   	 qtdImpares++;
	   }
	   
	   somaGeral += numeros;
	   qtdGeral++; 
    } 
    
    float mediaPares = (float)somaPares / qtdPares;
    float mediaGeral = (float)somaGeral / qtdGeral;
    
    system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Quantidade de n�meros pares: %d\n", qtdPares);
	printf("Quantidade de n�meros impares: %d\n", qtdImpares);
	printf("M�dia de valores pares: %.1f\n", mediaPares);
	printf("M�dia geral: %.1f\n", mediaGeral);
	
	return 0;
}

