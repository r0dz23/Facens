import java.util.ArrayList;

public class Projeto {
    private String nome;
    private ArrayList<Tarefa> tarefas;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas= new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(String descricao, Membro membro, String status) {
        Tarefa novaTarefa = new Tarefa(descricao, membro, status);
        tarefas.add(novaTarefa);
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarTarefas() {
        System.out.println("Projeto: " + nome);
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i).print());
        }
    }

    public String print() {
        return "Projeto: " + nome + " | Total de Tarefas: " + tarefas.size();
    }
}