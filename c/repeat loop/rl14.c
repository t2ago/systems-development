#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	float nota, soma = 0, media;
	int i;
	
	
	for (i = 1; i <= 3; i++) {
	    do {	
		    printf("Digite a %i� nota: ", i);
		    scanf("%f",&nota);		
	    } while (nota < 0 || nota > 10);
	    
	    soma += nota;
    }
	
	media = soma / 3;
	
	system("cls||clear");
	printf("M�dia: %.1f \n", media);
	
	if (media >= 7) {
		printf("APROVADO!");
	} else if (media >= 5 && media < 6.9) {
		printf("RECUPERA��O!");
	} else {
		printf("REPROVADO!");
	}
	        
	return 0;
}
