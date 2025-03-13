import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("digite o seu nome") ; // JOptionPane SÓ aceita String     
        int idade = Integer.parseInt(JOptionPane.showInputDialog("idade")) ; // Intenger.parseInt para JOption funcionar
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));



        System.out.println("Valor: "+valor);


    }


}