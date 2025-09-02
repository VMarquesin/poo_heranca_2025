package app;

public class Tarefa extends Atividade {
    private boolean isConcluido;

    public void setIsConcluido(boolean isConcluido){
        this.isConcluido = isConcluido;
    }
    public boolean isConcluido(){
        return isConcluido;
    }

    public Tarefa(long id, String descricao, boolean isConcluid){
        this.setId(id);
        this.setDescricao(descricao);
        this.setIsConcluido(isConcluid);
    }
}