#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i, j;
	
	printf("Digite um número: ");
	scanf("%d",&j);
	
	for(i = 1; i <= 10; i++) {
		printf("%d x %d = %d \n", j, i, i*j);
	}
	
	return 0;
}
