public class ContaBancaria {    

    private String id;               //// atributo
    private double saldo;            //// atributo

    public double getSaldo() {       
        return this.saldo;

    }

    public void depositar (double valor) {
        this.saldo += valor;

    }

    public void sacar (double valor) {
        if (this.saldo >= valor)
        this.saldo -= valor;

        System.out.println("Saldo insuficiente");

    }

}
