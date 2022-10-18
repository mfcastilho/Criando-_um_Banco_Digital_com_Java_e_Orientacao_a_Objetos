package br.com.bancodigital.entidades;

import java.time.LocalDate;

public abstract class Conta {

    private final int agenciaConta;
    private final String numeroConta;
    private Double saldoConta;
    private final LocalDate dataDeCriacaoDaConta;

    public Conta(int agenciaConta,
                 String numeroConta,
                 Double saldoConta,
                 LocalDate dataDeCriacaoDaConta) {

        this.agenciaConta = agenciaConta;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.dataDeCriacaoDaConta = dataDeCriacaoDaConta;
    }

    public int getAgenciaConta() {
        return agenciaConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public LocalDate getDataDeCriacaoDaConta() {
        return dataDeCriacaoDaConta;
    }

    public abstract boolean sacar(Double valorSaque);

    public abstract void depositar(Double valorDeposito);

    public abstract boolean transferir(Conta conta, Double valorTransferencia);
}
