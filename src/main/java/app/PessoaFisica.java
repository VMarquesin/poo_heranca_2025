package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Pessoa{
    // private String nome;
    // private String endereco;
    // private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;


    // public String getNome(){
    //     return nome;
    // }
    // public void setNome(String nome){
    //     this.nome = nome;
    // }

    // public String getEndereco(){
    //     return endereco;
    // }
    // public void setEndereco(String endereco){
    //     this.endereco = endereco;
    // }
    // public LocalDate getDataCriacao(){
    //     return dataCriacao;
    // }
    // public void setDataCriacao(LocalDate dataCriacao){
    //     this.dataCriacao = dataCriacao;
    // }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf){
        super(nome, endereco, LocalDate.now());
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }
    @Override
    public String exibirInformacoes(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "--- Informações de Pessoa Física ---\n" +
            // "Nome: " + this.getNome() + "\n" +
            "CPF: " + this.getCpf() + "\n" +
            "Data de Nascimento: " + this.getDataNascimento().format(formatador) + "\n";
            // "Endereço: " + this.getEndereco() + "\n"
            // "Data de Cadastro: " + this.getDataCriacao();
    }
}