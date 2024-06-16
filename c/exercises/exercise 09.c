#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "");
	
	int primeiroNumero, segundoNumero;
	int soma, produto, menorValor, maiorValor;
	float media;
	
	printf("Digite o primeiro número: ");
	scanf("%i",&primeiroNumero);
	
	printf("Digite o segundo número: ");
	scanf("%i",&segundoNumero);
	
	soma = primeiroNumero + segundoNumero;
	produto = primeiroNumero * segundoNumero;
        media = soma / (float) 2;
	
	if (primeiroNumero > segundoNumero) {
		maiorValor = primeiroNumero;
		menorValor = segundoNumero;
	} else {
		maiorValor = segundoNumero;
		menorValor = primeiroNumero;
	}
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Primeiro número: %i \n", primeiroNumero);
	printf("Segundo número: %i \n", segundoNumero);
	printf("Média: %.1f \n", media);
	printf("Soma: %i \n", soma);
	printf("Produto: %i \n", produto);
	printf("Maior valor: %i \n", maiorValor);
	printf("Menor valor: %i \n", menorValor);
	
	if (primeiroNumero == segundoNumero) {
		printf("Os números são iguais!");
	} else {
		printf("Os números NÃO são iguais!");
	}
	
	return 0;
}
