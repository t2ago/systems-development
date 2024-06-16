#include <stdio.h>
#include <locale.h>

#define TAM 5

int main () {
	setlocale(LC_ALL, "");
	
	int i;
	int idade[TAM];
	char nome[TAM][200];
	
	for (i = 0; i < TAM; i++) {
		system("cls||clear");
		printf("Digite o nome da pessoa: ");
		scanf("%s",&nome[i]);
		
		printf("Digite a idade da pessoa: ");
		scanf("%d",&idade[i]);
	}
	
	system("cls||clear");
    printf("=== Exibindo resultados ===\n");
    for (i = 0; i < TAM; i++) {
        printf("\n%dª pessoa: \n", i+1);
        printf("Nome: %s\n", nome[i]);
        printf("Idade: %d\n", idade[i]);
    }
    
 return 0;   
}
