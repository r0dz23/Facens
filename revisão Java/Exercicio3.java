import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o código do aluno (ou 0 para finalizar): ");
            int codigoAluno = scanner.nextInt();
            if (codigoAluno == 0) break;

            double somaNotas = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Digite a nota " + i + ": ");
                somaNotas += scanner.nextDouble();
            }

            double media = somaNotas / 3;
            System.out.println("Média do aluno " + codigoAluno + ": " + media);
        }

        scanner.close();
    }
}
