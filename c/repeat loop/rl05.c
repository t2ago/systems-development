#include <stdio.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
	int i;
	
	printf("Digite um número: ");
	scanf("%d",&i);
	
	for(i = 1; i <= 10; i++) {
		printf("%d x %d = %d \n", 2, i, i*2);
	}
	
	return 0;
}
