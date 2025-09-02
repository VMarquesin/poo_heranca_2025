package app;

public class Tarefa{
    private long id;
    private String descricao;
    private boolean isConcluido;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

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