import java.util.Scanner;

public class menu3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        while (op!=5) {
            System.out.println("\nMenu");
            System.out.println("1 mochila escolar");
            System.out.println("2 mochila de viagem");
            System.out.println("3 mochila esportiva");
            System.out.println("4 sair");
            System.out.println("Escolha uma opção: ");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("mochila escolar: compacta e ideal para estudantes");
                    break;
                case 2:
                    System.out.println("mochila de viagem: espaçosa, ideal para longas jornadas");
                    break;
                case 3:
                    System.out.println("mochila esportiva: leve, resistente e ergonômica");
                    break;
                case 4:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("vc digitou uma opcao errada");
                    break;
            }
        }
        sc.close();
    }
}