#include <stdio.h>
#include <locale.h>
#include <ctype.h>
#include <limits.h>

main () {
	setlocale(LC_ALL, "");
	
	int i, soma;
	int idade, maior = INT_MIN, menor = INT_MAX, qtdMulheres = 0, opcao;
	char sexo;
	float salario, media;
	
	do {
		system("cls||clear");
		printf ("Idade: ");
		scanf("%i",&idade);
		
		if (idade > maior) {
		maior = idade;
        } 
			
	    if (idade < menor) {
		menor = idade;
	    }
		
		fflush(stdin);
		
		printf("Sexo (M/F): ");
		scanf("%c",&sexo);
		sexo = toupper(sexo);
		
		printf("Salário: ");
		scanf("%f",&salario);
		
		i++;
		soma += salario;
		
		if (sexo = 'F' && salario > 5000) {
			qtdMulheres++;
		}
		
		system("cls||clear");
		printf("1 - Adicionar pessoa.\n");
		printf("2 - Exibir resultados e sair.\n");
		printf("Escolha uma opção: ");
		scanf("%i",&opcao);
		
	} while (opcao != 2);
	
	media = soma / i;
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Média salárial: %.2f \n", media);
	printf("Maior idade: %i \n", maior);
	printf("Menor idade: %i \n", menor);
	printf("Mulheres com salário a partir de R$ 5.000: %i \n", qtdMulheres);
	
 return 0;
}
