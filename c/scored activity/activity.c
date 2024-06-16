#include <stdio.h>
#include <locale.h>
#include <limits.h>

#define TAM 5

int main(){
    setlocale(LC_ALL,"");

    int numeros[TAM], i, pares = 0, impares = 0, negativos = 0, positivos = 0;
    int menorN = INT_MAX, maiorN = INT_MIN, paresSoma, imparesSoma, somaTotal;
    float paresMedia, imparesMedia, mediaTotal, numerosInseridos;

    printf("Solicitando dados: \n");
    for(i = 0; i < TAM; i++) {
	printf("Digite o %iº numero: ", i + 1);
	scanf("%i",&numeros[i]);
	
	numerosInseridos++;
	
	if (numeros[i] % 2 == 0) {
		pares++;
		paresSoma += numeros[i];
	} else {
		impares++;
		imparesSoma += numeros[i];
	}
	
	if(numeros[i]< 0){
		negativos++;
	}   else if (numeros[i]> 0) {
		positivos ++; 
	}
	
	if (numeros[i] > maiorN) {
		maiorN = numeros[i];
	} else if (numeros[i] < menorN) {
		 menorN  = numeros[i];
		}
		   	
	}
    
	paresMedia = paresSoma / pares;
	imparesMedia = imparesSoma / impares;
	mediaTotal = (paresSoma + imparesSoma) / numerosInseridos;
	
	system("cls||clear"); 
    printf("=== EXIBINDO RESULTADOS ===");
    for (i = TAM-1; i >= 0; i--) {
    printf("\n%iº número: %i",i+1, numeros[i]);
	}	
    printf("\n\nQuantidade de números pares: %i", pares);
    printf("\nQuantidade de números impares: %i", impares);
    printf("\n\nQuantidade de números positivos: %i", positivos);
    printf("\nQuantidade de números negativos: %i\n", negativos);
	printf("\nQuantidade de números inseridos: %i\n", TAM);
	printf("\nMédia números pares: %.1f", paresMedia);
	printf("\nMédia números impares: %.1f", imparesMedia);
	printf("\nMédia de todos os números inseridos: %.1f", mediaTotal);
	printf("\n\nMaior número: %i", maiorN);
	printf("\nMenor número: %i", menorN);
	
 return 0;	
}
