package app;

import java.time.LocalDate;

public class Pessoa {
    
    protected String nome;
    protected String endereco;
    protected LocalDate dataCriacao;

    // Construtor para inicializar os dados
    public Pessoa(String nome, String endereco, LocalDate dataCriacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao() {
        return this.dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    // Método corrigido (sem "class" e com o return ativo)
    public String exibirInformacoes() {
        return "Nome: " + this.nome + "\n" +
               "Endereço: " + this.endereco + "\n" +
               "Data de Cadastro: " + this.dataCriacao;
    }
}