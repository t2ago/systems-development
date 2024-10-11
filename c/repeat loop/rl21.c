#include <stdio.h>
#include <locale.h>
#include <limits.h>
#include <time.h>

main () {
	setlocale(LC_ALL, "");
	
	int i, opcao, filhos, mediaFilhos, somaFilhos;
	float salario, mediaSalarial, somaSalario;
	float maiorSalario = INT_MIN, menorSalario = INT_MAX;
	
	do {
		system("cls||clear");
		printf("1 - Adicionar fam�lia. \n");
		printf("2 - Sair e exibir resultados. \n");
		printf("Escolha uma op��o: ");
		scanf("%i",&opcao);
		
		switch (opcao) {
		    case 1:
		    	system("cls||clear");
		    	printf("Sal�rio total da fam�lia: ");
		    	scanf("%f",&salario);
		    	
		    	i++;
		    	somaSalario += salario ;
		    	
		    	if (salario > maiorSalario) {
		        maiorSalario = salario;
                } 
			
	            if (salario < menorSalario) {
		        menorSalario = salario;
	            }
		    	
		    	printf("N�mero de filhos: ");
		    	scanf("%i",&filhos);
		    	
		    	somaFilhos += filhos;

		        break;
		    case 2:
			    break;
			default:
			    printf("Op��o invalida!");
				sleep(4);
				system("cls||clear"); 
	}
				
	} while (opcao != 2);
	
	mediaSalarial = somaSalario / i;
	mediaFilhos = somaFilhos / i;
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Total de fam�lias que responderam a pesquisa: %i \n", i);
	printf("M�dia do sal�rio da popula��o: %.2f \n", mediaSalarial);
	printf("M�dia do n�mero de filhos: %i \n", mediaFilhos);
	printf("Maior sal�rio: %.2f \n", maiorSalario);
	printf("Menor sal�rio: %.2f \n", menorSalario);
	
	
 return 0;
}
