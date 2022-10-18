package br.com.bancodigital.entidades;

public class Cliente {
    private final String nome;
    private final String sobrenome;
    private final int idade;
    private final String profissao;
    private final String cpf;
    private final Endereco endereco;
    private final Double remuneracao;
    private final Conta conta;



    public Cliente(String nome, String sobrenome,
                   int idade, String profissao,
                   String cpf, Endereco endereco,
                   Double remuneracao, Conta conta) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.profissao = profissao;
        this.cpf = cpf;
        this.endereco = endereco;
        this.remuneracao = remuneracao;
        this.conta = conta;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getRemuneracao() {
        return remuneracao;
    }

    public Conta getConta() {
        return conta;
    }
}
