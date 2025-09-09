package app;

import java.time.LocalDate;
import java.time.Month; // 1. Importação adicionada

public class Main {
    public static void main(String[] args) {
        // Tarefa[] tarefas = new Tarefa[5];
        // Compromisso[] compromissos = new Compromisso[5];

        // tarefas[0] = new Tarefa(0, "First object", false);
        // tarefas[4] = new Tarefa(1, "new object", false);

        // compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        // System.out.println(tarefas[4].getDescricao());
        // System.out.println(tarefas[0].getDescricao());

       PessoaFisica pf = new PessoaFisica(
            "vinicius",  
            "1651651",                   
            LocalDate.of(2003, Month.MARCH, 29),
              "Rua sem nome, 0"
        );

        System.out.println("Pessoa Física criada com sucesso!");
        System.out.println(pf.exibirInformacoes());
    
        System.out.println("\n\n--- Criando Pessoa Jurídica ---");
        
       
        PessoaJuridica pj = new PessoaJuridica(
            "Tecnologia & Inovação LTDA",  
            "Tech Inova",  
            "12.345.678/0001-99",    
            "Avenida Brasil, 1500"     
        );
        
        System.out.println(pj.exibirInformacoes());    
    }
}