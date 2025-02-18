import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[4];
        int votosNulos = 0, votosEmBranco = 0, codigoVoto;

        while (true) {
            System.out.print("Digite o código do voto (1-4 para candidatos, 5 para nulo, 6 para em branco, 0 para finalizar): ");
            codigoVoto = scanner.nextInt();

            if (codigoVoto == 0) break;

            if (codigoVoto >= 1 && codigoVoto <= 4) {
                votos[codigoVoto - 1]++;
            } else if (codigoVoto == 5) {
                votosNulos++;
            } else if (codigoVoto == 6) {
                votosEmBranco++;
            }
        }

        System.out.println("Votos para candidato 1: " + votos[0]);
        System.out.println("Votos para candidato 2: " + votos[1]);
        System.out.println("Votos para candidato 3: " + votos[2]);
        System.out.println("Votos para candidato 4: " + votos[3]);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos em branco: " + votosEmBranco);

        scanner.close();
    }
}
