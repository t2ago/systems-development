#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <ctype.h>

int main () {
    setlocale(LC_ALL, "");
    
    char sexo;
    float peso, altura;
    
    printf("Digite seu sexo: ");
    scanf("%c",&sexo);
    
    printf("Digite sua altura: ");
    scanf("%f",&altura);
    
    system("cls||clear");
    
    sexo = toupper (sexo); // Converte em maiúsculo

    switch (sexo) {
    	case 'M':
    		peso = (72.7 * altura) - 58;
    		printf("=== Exibindo Resultados ===\n");
            printf("Seu peso ideal é: %.2f \n", peso);
            break;
        case 'F':
        	peso = (62.1 * altura) - 44.7;
        	printf("=== Exibindo Resultados ===\n");
            printf("Seu peso ideal é: %.2f \n", peso);
            break;
        default :
        	printf("Sexo indefinido");
    }
			
     return 0;
	}
