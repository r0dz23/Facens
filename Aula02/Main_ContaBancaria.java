public class Main_ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria ();

        System.out.println(c1.getSaldo());
        c1.depositar(100);
        System.out.println(c1.getSaldo());
        c1.sacar(70);
        System.out.println();

    }
    
}
