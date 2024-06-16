#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
	setlocale(LC_ALL, "");

	char aluno[200];
	int idade;
	float primeiraNota, segundaNota, terceiraNota, media;
	
	
	printf("Nome do aluno: ");
	gets(aluno);
	
	fflush(stdin);
	
	printf("Sua idade: ");
	scanf("%i",&idade);
	
	printf("Primeira nota: ");
	scanf("%f",&primeiraNota);
	
	printf("Segunda nota: ");
	scanf("%f",&segundaNota);
	
	printf("Terceira nota: ");
	scanf("%f",&terceiraNota);
	
	media = (primeiraNota + segundaNota + terceiraNota) / 3;
	
	system("cls||clear");
	printf("=== Exibindo resultados === \n");
	printf("Nome do aluno: %s \n", aluno);
	printf("Idade: %i \n", idade);
	printf("Primeira nota: %.1f \n", primeiraNota);
	printf("Segundo nota: %.1f \n", segundaNota);
	printf("Terceira nota: %.1f \n", terceiraNota);
	printf("Média do aluno: %.1f \n", media);
	
	if (media < 7) {
		printf("REPROVADO!");
	} else {
		printf("APROVADO!");
		
		return 0;
	}
	
}
