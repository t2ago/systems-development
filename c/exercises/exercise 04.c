#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "");
	
    int numero, antecessor, sucessor;
	
    printf("Digite um número: ");
    scanf("%i",&numero);
	
    antecessor = numero - 1;
    sucessor = numero + 1;

    system("cls||clear");
    printf("=== Exibindo resultados ===\n");
    printf("Número: %i \n", numero);
    printf("Antecessor: %i \n", antecessor);
    printf("Sucessor: %i \n", sucessor);
    
    return 0;
}
