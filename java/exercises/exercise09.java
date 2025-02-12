import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        while (op!=4) {
            System.out.println("\nMenu");
            System.out.println("1 caixa de papelão");
            System.out.println("2 sacola plástica");
            System.out.println("3 embalagem de vidro");
            System.out.println("4 sair");
            System.out.println("Escolha uma opção: ");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("caixa de papelão: ideal para transporte e armazenamento");
                    break;
                case 2:
                    System.out.println("sacola plástica: leve e prática, mas pouco sustentável");
                    break;
                case 3:
                    System.out.println("embalagem de vidro: resistente e reutilizável");
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