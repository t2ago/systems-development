public class ArrayDupla {
    public static void main(String[] args) {
        String[] alunos = {"Ana", "Bruno", "Carlos", "Diana"};
        double [] notas = {8.5, 7.0, 9.2, 6.8};

        for (int i = 0;i < alunos.length; i++) {
            System.out.println("Aluno: "+ alunos[i] + " - Nota: " + notas[i]);
        }
    }
}