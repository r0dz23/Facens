import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPrecos = 0, somaPrecosComAumento = 0;
        int count = 0;

        while (true) {
            System.out.print("Digite o código do produto (negativo para finalizar): ");
            int codigoProduto = scanner.nextInt();
            if (codigoProduto < 0) break;

            System.out.print("Digite o preço de custo do produto: ");
            double precoCusto = scanner.nextDouble();
            double precoNovo = precoCusto * 1.2;

            somaPrecos += precoCusto;
            somaPrecosComAumento += precoNovo;
            count++;

            System.out.println("Código: " + codigoProduto + " | Preço com aumento: " + precoNovo);
        }

        if (count > 0) {
            System.out.println("Média dos preços sem aumento: " + somaPrecos / count);
            System.out.println("Média dos preços com aumento: " + somaPrecosComAumento / count);
        } else {
            System.out.println("Nenhum produto foi inserido.");
        }

        scanner.close();
    }
}
