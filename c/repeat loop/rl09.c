#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i, numero[5], soma = 0;
	
    printf("Digite cinco n�meros inteiros: \n");
	
	for(i = 0; i < 5; i++) {
	    printf("N�mero %d: ", i + 1);
	    scanf("%d",&numero[i]);
	    }
	    
	for(i = 0; i < 5; i++) {
		soma += numero[i];
	}
	    
	printf("A soma dos n�meros �: %d \n", soma);
	    
    return 0;
	}
