import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a temperatura em graus Celsius: ");
            double Cl = scanner.nextDouble();

            double Fr = converterParaFahrenheit(Cl);
            System.out.println(Cl + "°C equivalem a " + Fr + "°F.\n");
        }
    }

    public static double converterParaFahrenheit(double Cl) {
        return Cl * 9 / 5 + 32;
    }
}
