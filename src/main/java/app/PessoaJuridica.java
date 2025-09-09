package app;

import java.time.LocalDate;

public class PessoaJuridica{
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasma;
    private String cnpj;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public String getNomeFantasma(){
        return nomeFantasma;
    }
    public void setNomeFantasma(String nomeFantasma){
        this.nomeFantasma = nomeFantasma;
    }

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String endereco, String nomeFantasma, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setNomeFantasma(nomeFantasma);
        this.setCnpj(cnpj);
    }

    // Dentro da classe PessoaJuridica

    public String exibirInformacoes(){
        return "--- Informações de Pessoa Jurídica ---\n" +
            "Razão Social: " + this.getNome() + "\n" +
            "Nome Fantasia: " + this.getNomeFantasma() + "\n" +
            "CNPJ: " + this.getCnpj() + "\n" +
            "Endereço: " + this.getEndereco() + "\n" +
            "Data de Criação: " + this.getDataCriacao();
    }
}