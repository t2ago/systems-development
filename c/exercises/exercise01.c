#include <stdio.h>
#include <locale.h>

int main(){
	// linguagêm
	setlocale(LC_ALL, "portuguese");
	
    // variáveis
    float primeiroNumero, segundoNumero;
    float soma, subtracao, multiplicacao, divisao;

    // solicitando dados
    printf("Digite o primeiro número: ");
    scanf("%f",&primeiroNumero);

    printf("Digite o segundo número: ");
    scanf("%f",&segundoNumero);
    
    // cálculos
    soma = primeiroNumero + segundoNumero;
    subtracao = primeiroNumero - segundoNumero;
    multiplicacao = primeiroNumero * segundoNumero;
    divisao = primeiroNumero / segundoNumero;
    
    // exibindo dados
    system("cls||clear");
    printf("=== Exibindo resultados ===\n");
    printf("Primeiro número: %f \n", primeiroNumero);
    printf("Segundo número: %f \n", segundoNumero);
    printf("Soma = %f \n", soma);
    printf("Subtração = %f \n", subtracao);
    printf("Multiplicação = %f \n", multiplicacao);
    printf("Divisão = %f \n", divisao);
    
    return 0;
}
