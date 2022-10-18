package br.com.bancodigital.entidades;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int agenciaContaPoupanca, String numeroContaPoupanca,
                         Double saldo, LocalDate dataDeCriacaoDaContaPoupanca) {

        super(agenciaContaPoupanca,numeroContaPoupanca,saldo,dataDeCriacaoDaContaPoupanca);
    }

    @Override
    public boolean sacar(Double valorSaque) {
        Double taxa = 0.05;
        if(valorSaque <= getSaldoConta()){
            setSaldoConta(getSaldoConta() - (valorSaque + (valorSaque*taxa)));
            return true;
        }
        return false;
    }

    @Override
    public void depositar(Double valorDeposito) {
        setSaldoConta(getSaldoConta() + valorDeposito);
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
