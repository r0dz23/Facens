import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalHomens = 0, totalMulheres = 0;
        int somaIdadeMulheres = 0, somaIdadeHomens = 0;
        int totalPessoas18a35 = 0;
        int totalPessoas = 1000;
        double somaAlturaMulheres = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Informe o sexo da pessoa (0 para feminino, 1 para masculino): ");
            int sexo = scanner.nextInt();

            System.out.print("Informe a idade da pessoa: ");
            int idade = scanner.nextInt();
            
            System.out.print("Informe a altura da pessoa (em metros): ");
            double altura = scanner.nextDouble();

            if (sexo == 0) {
                totalMulheres++;
                somaIdadeMulheres += idade;
                somaAlturaMulheres += altura;
            } else if (sexo == 1) {
                totalHomens++;
                somaIdadeHomens += idade;
            }

            if (idade >= 18 && idade <= 35) {
                totalPessoas18a35++;
            }
        }

        double mediaIdadeGrupo = (double) (somaIdadeMulheres + somaIdadeHomens) / totalPessoas;
        double mediaAlturaMulheres = totalMulheres > 0 ? somaAlturaMulheres / totalMulheres : 0;
        double mediaIdadeHomens = totalHomens > 0 ? somaIdadeHomens / totalHomens : 0;
        double percentualPessoas18a35 = (double) totalPessoas18a35 / totalPessoas * 100;

        System.out.println("Média da idade do grupo: " + mediaIdadeGrupo);
        System.out.println("Média da altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média da idade dos homens: " + mediaIdadeHomens);
        System.out.println("Percentual de pessoas com idade entre 18 e 35 anos: " + percentualPessoas18a35);
    }
}
