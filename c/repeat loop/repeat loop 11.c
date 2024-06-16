#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i;
	float notas, media, soma;
	
	for(i = 0; i < 4; i++) {
		printf("Digite quatro notas: ");
	    scanf("%f",&notas);
	    
	    soma += notas;
	} 
	
	media = soma / 4;
	
	printf("Média: %.2f \n", media);
	
	return 0;
}
	
