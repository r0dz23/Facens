import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0, count = 0, numero;

        while (true) {
            System.out.print("Digite um número (ou 0 para finalizar): ");
            numero = scanner.nextInt();
            if (numero == 0) break;

            if (numero % 2 == 0) {
                soma += numero;
                count++;
            }
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("A média dos números pares é: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        scanner.close();
    }
}
