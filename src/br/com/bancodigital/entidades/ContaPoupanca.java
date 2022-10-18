package br.com.bancodigital.entidades;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{

    private int agenciaContaPoupanca;
    private String numeroContaPoupanca;
    private Double saldo;
    private LocalDate dataDeCriacaoDaContaPoupanca;

    public ContaPoupanca(int agenciaContaPoupanca, String numeroContaPoupanca,
                         Double saldo, LocalDate dataDeCriacaoDaContaPoupanca) {

        super(agenciaContaPoupanca,numeroContaPoupanca,saldo,dataDeCriacaoDaContaPoupanca);
    }

    @Override
    public boolean sacar(Double valorSaque) {
        Double taxa = 0.02;
        if(valorSaque <= saldo){
            saldo -= valorSaque;
            return true;
        }
        return false;
    }

    @Override
    public void depositar(Double valorDeposito) {
        saldo += valorDeposito;
    }

    @Override
    public boolean transferir(Conta conta, Double valorTransferencia) {

        Double taxa = 0.05;
        if(getSaldoConta() >= valorTransferencia){
            setSaldoConta(getSaldoConta()-(valorTransferencia + (valorTransferencia*taxa)));
            conta.depositar(valorTransferencia);
            return true;
        }
        return false;
    }


}
