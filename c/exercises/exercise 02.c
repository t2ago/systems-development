#include <stdio.h>
#include <locale.h>

int main(){
	// linguagêm
	setlocale(LC_ALL, "portuguese");
	
	// variáveis
	char aluno[200];
	int idade;
	float primeiraNota, segundaNota, terceiraNota, quartaNota, media;
	
	// solicitando dados
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
	
	printf("Quarta nota: ");
	scanf("%f",&quartaNota);
	
	// cálculos
	media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
	
	// exibindo resultados
	system("cls||clear");
	printf("=== Exibindo resultados === \n");
	printf("Nome do aluno: %s \n", aluno);
	printf("Idade: %i \n", idade);
	printf("Primeira nota: %f \n", primeiraNota);
	printf("Segundo nota: %f \n", segundaNota);
	printf("Terceira nota: %f \n", terceiraNota);
	printf("Quarta nota: %f \n", quartaNota);
	printf("Média do aluno: %f \n", media);
}
