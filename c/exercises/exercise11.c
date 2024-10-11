#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main () {
    setlocale(LC_ALL, "");
    
    int macas;
    float valorMaca, desconto, valorTotal;
    
    printf("Quantas maçãs voce quer comprar: ");
    scanf("%i",&macas);
	    
    system("cls||clear");
    
    valorMaca = macas * 1.30;
    desconto = macas * 1.00;
    
    printf("=== Exibindo resultados ===\n");
    printf("Maçãs compradas: %i \n", macas);
    if (macas < 12) {
    	printf("Valor total a pagar: R$ %.2f", valorMaca);
	} else {
        printf("Valor total a pagar: R$ %.2f", desconto);
	}
    
    return 0;
}
