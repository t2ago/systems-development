#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "");
	
	int idade;
	
	printf("Digite sua idade: ");
	scanf("%i",&idade);
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	if (idade < 18 || idade >=65) {
		printf("Voc� N�O � obrigado a votar!");
	} else {
		printf("Voc� � obrigado a votar!");
	}
	
	return 0;
}
