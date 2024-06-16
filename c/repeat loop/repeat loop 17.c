#include <stdio.h>
#include <locale.h>
#include <ctype.h>

int main() {
    setlocale(LC_ALL, "");

    float media;
    int soma = 0;
    int valores;
    int i = 0;

    while (1) {
        printf("Digite o %iº numero: ", i + 1);
        scanf("%i", &valores);

        if (valores < 0) {
            break;
        }

        soma += valores;
        i++;
    }

    if (i != 0) { 
        media = (float)soma / i;
        printf("Média: %.1f\n", media);
    } else {
        printf("Nenhum número válido foi inserido.");
    }

    return 0;
}
