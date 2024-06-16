#include <stdio.h>
#include <locale.h>
#include <ctype.h>
#include <time.h>

int main() {	
	setlocale(LC_ALL, "");

	float nota, soma = 0, media;
	int contador = 0;
	char resposta;
	
	do{
		printf("Digite uma Nota: ");
		scanf("%f",&nota);
		
		fflush(stdin);
	
		system("cls || clear");	
		printf("Escolha uma das opções abaixo. \n");
		printf("S - Inserir mais uma Nota. \n");
		printf("P - Notas inseridas. \n");
		printf("N - Média aritmética das notas informadas. \n");
		printf("Resposta: ");
		scanf("%c",&resposta);
		resposta = toupper(resposta);
		
		soma += nota;
		contador++;
		
		system("cls||clear");
		
		switch(resposta) {
		case 'S':
			system("cls || clear");	
			break;
		case 'P':
			printf("Quantidade de notas inseridas: %i  \n", contador);
			sleep(5);
			system("cls || clear");
			break;
		case 'N':
			system("cls || clear");
			break;
		default:
			printf("Opção inválida! \n");
			sleep(5);
			system("cls || clear");
		}				
	} while (resposta != 'N');

	media = soma / contador;
	
	printf("=== Exibindo Resultados ===\n");
	printf("Média: %.1f \n",media);
	
	return 0;
}
