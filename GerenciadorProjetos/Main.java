public class Main {
    public static void main(String[] args) {
        
        Membro dev1 = new Membro ("Rodrigo", "Desenvolvedor");
        Membro dev2 = new Membro ("Anderson", "Analista");

        Projeto projeto = new Projeto ("Sistema de Gestão");

        projeto.adicionarTarefa("Criar banco de dados", dev1, "Pendente");
        projeto.adicionarTarefa("Desenvolver interface", dev2, "Em andamento");

        projeto.listarTarefas();;

        projeto.removerTarefa(0);

        projeto.listarTarefas();

}

}