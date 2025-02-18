import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int countPares = 0, countImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[countPares++] = numeros[i];
            } else {
                impares[countImpares++] = numeros[i];
            }
        }

        System.out.print("Números: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.print("\nNúmeros Pares: ");
        for (int i = 0; i < countPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nNúmeros Ímpares: ");
        for (int i = 0; i < countImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        scanner.close();
    }
}
