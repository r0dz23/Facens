import java.util.Scanner; 

public class VerificadorPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Digite um número:"); 
        int numero = scanner.nextInt(); 

        String resultado = verificarPar(numero); 

        System.out.println("O número é par? " + resultado);

        scanner.close(); 
    }

    public static String verificarPar(int numero) {
        if (numero % 2 == 0) {
            return "Verdadeiro";
        } else {
            return "Falso";
        }
    }
}
