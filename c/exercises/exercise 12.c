#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int main () {
    setlocale(LC_ALL, "");
    
    char aluno[200];
    float primeiraNota, segundaNota, media;
    
    printf("Digite o nome do aluno: ");
    fgets(aluno,200,stdin);
    aluno[strcspn(aluno, "\n")] =0;
    
    printf("Digite a primeira nota: ");
    scanf("%f",&primeiraNota);
    
    fflush(stdin);
    
    printf("Digite a segunda nota: ");
    scanf("%f",&segundaNota);
    
    media = (primeiraNota + segundaNota) / 2;
    
    system("cls||clear");
    printf("=== Exibindo resultados ===\n");
    printf("Aluno: %s \n", aluno);
    if (media >=9) {
    	printf("Nota: A \nAPROVADO!");
	} else if (media >=7.5 && media <9) {
		printf("Nota B \nAPROVADO!");
	} else if (media >=6 && media <7.5) {
		printf("Nota C \nAPROVADO!");
    } else if (media >=4 && media <6) {
		printf("Nota D \nREPROVADO!");
    } else if (media <4) {
		printf("Nota E \nREPROVADO!");
    }
	
 return 0;	
}
