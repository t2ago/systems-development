import java.util.Scanner;

public class menu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        while (op!=5) {
            System.out.println("\nMenu");
            System.out.println("1 caneta esferográfica");
            System.out.println("2 caneta em gel");
            System.out.println("3 caneta tinteiro");
            System.out.println("4 sair");
            System.out.println("Escolha uma opção: ");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("caneta esferográfica: econômica e de longa duração");
                    break;
                case 2:
                    System.out.println("caneta gel: tinta mais pigmentada e escrita suave");
                    break;
                case 3:
                    System.out.println("caneta tinteiro: clássica e elegante, usada para caligrafia");
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