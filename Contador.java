import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            System.out.print("Digite o caractere que deseja contar: ");
            char caractere = scanner.next().charAt(0);
            scanner.nextLine(); 

            int contagem = contarCaracter(frase, caractere);
            System.out.println("O caractere '" + caractere + "' aparece " + contagem + " vezes na frase.\n");
        }
    }

    public static int contarCaracter(String frase, char caractere) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caractere) {
                contador++;
            }
        }
        return contador;
    }
}
