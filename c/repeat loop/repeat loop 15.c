#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	float nota, soma = 0, media;
	char resposta;
	int i = 0;
	
	    do {	
		    printf("Digite a nota: ");
		    scanf("%f",&nota);
		    
		    soma += nota;
		    i++;
			
			printf("Deseja inserir mais uma nota? (S/N): ");
			scanf(" %c",&resposta);
						
	    } while (resposta == 'S' || resposta == 's');
	    
	    //soma += nota;
	
	media = soma / i;
	
	system("cls||clear");
	printf("Média: %.1f \n", media);
	
	if (media >= 7) {
		printf("APROVADO!");
	} else if (media >= 5 && media < 6.9) {
		printf("RECUPERAÇÃO!");
	} else {
		printf("REPROVADO!");
	}
	        
	return 0;
}
