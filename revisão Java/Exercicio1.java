import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, count = 0, numero;

        while (true) {
            System.out.print("Digite um valor inteiro positivo (ou um valor negativo para finalizar): ");
            numero = scanner.nextInt();
            if (numero < 0) break;

            soma += numero;
            count++;
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("A média aritmética é: " + media);
        } else {
            System.out.println("Nenhum valor válido foi inserido.");
        }

        scanner.close();
    }
}
