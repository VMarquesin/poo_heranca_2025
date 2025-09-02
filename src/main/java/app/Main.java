package app;

public class Main{
    public static void main(String[] args) {
        Tarefa[] tarefas = new Tarefa[5];

        tarefas[0] = new Tarefa(0, "First object", false);
        tarefas[4] = new Tarefa(1, "new object", false);

        System.out.println(tarefas[4].getDescricao());
        System.out.println(tarefas[0].getDescricao());
    }
}