#include <stdio.h>
#include <string.h>
#include <locale.h>

int main() {
	setlocale(LC_ALL, "");
	
    char loginSalvo[200] = "tiago";
    char senhaSalva[200] = "12345";
    char login[200];
    char senha[200];
    
    printf("Digite o login: ");
	scanf("%s",&login);
	
	printf("Digite a senha: ");
	scanf("%s",&senha);
	
	if (strcmp(login, loginSalvo) == 0 && strcmp(senha, senhaSalva) == 0) {
	    printf("Bem vindo!");
	} else {
		printf("Acesso negado!");
	}

	return 0;
}
