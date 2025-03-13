public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice(){
        this.numero = numero;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;

    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel){
        this.numero = numero;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;


    }

    public double calcularValor(){
        if (sexo == 'M' && idade <= 25) {      //  'uma aspas para digitar uma letra só' 
            return valorAutomovel *10/ 100;
        }
        if (sexo == 'M' && idade > 25) {
            return valorAutomovel *5/100;
        }
        if (sexo == 'F')
            return valorAutomovel *2/100;

    }


    public String Imprimir(){
        return "Número: " + numero + "Nome: " + nome + "Idade: " + idade + "Sexo: " + sexo + "valorAutomovel" + valorAutomovel + "Valor Apolice" + calcularValor();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumero(int numero){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getIdade (){
        return idade;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public char getSexo (
        
    )
}