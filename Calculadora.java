import java.util.Scanner; 

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
    
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); 
        
        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();  
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();  
        
        double resultado = calcular(num1, num2, operador);
        
        System.out.println("O resultado é: " + resultado);
        
        scanner.close();  
    }

    public static double calcular(double num1, double num2, String operador) {
        double resultado = 0;  
        
        if (operador.equals("+")) {
            resultado = num1 + num2;  
        } else if (operador.equals("-")) {
            resultado = num1 - num2;  
        } else if (operador.equals("*")) {
            resultado = num1 * num2; 
        } else if (operador.equals("/")) {
            if (num2 != 0) {  
                resultado = num1 / num2; 
            } else {
                System.out.println("Erro: divisão por zero!");
                return 0;  
            }
        } else {
            System.out.println("Operador inválido!");
            return 0;  
        }

        return resultado;  
    }
}
