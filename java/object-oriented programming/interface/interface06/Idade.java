import javax.swing.JOptionPane;

public class CaixaConfirmação {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Quantos anos você tem?");

        int resposta = Integer.parseInt(input);

        if (resposta >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Você é menor de idade", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }
}
