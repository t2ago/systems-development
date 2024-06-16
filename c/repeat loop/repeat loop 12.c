#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i;
	float notas, media, soma;
	
	for(i = 0; i < 3; i++) {
	    printf("Digite a %iª nota: ", i + 1);
	    scanf("%f",&notas);
	    
	    soma += notas;
	} 
	
	media = soma / 3;
	
	system("cls||clear");
	printf("=== Exibindo resultados ===\n");
	printf("Média: %.2f \n", media);
	
	if (media >= 7) {
	   printf("APROVADO!");
	} else if (media >= 4 && media < 7) {
	   printf("RECUPERAÇÃO!");
	} else {
	   printf("REPROVADO!");
	}
	
 return 0;
}
