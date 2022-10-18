package br.com.bancodigital.entidades;

import java.time.LocalDate;

public class ContaCorrente extends Conta{



    public ContaCorrente(int agenciaContaCorrente, String numeroContaCorrente,
                         Double saldo, LocalDate dataDeCriacaoDaContaCorrente) {

        super(agenciaContaCorrente,numeroContaCorrente,saldo,dataDeCriacaoDaContaCorrente);
    }

    @Override
    public boolean sacar(Double valorSaque) {
        Double taxa = 0.02;
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
        Double taxa = 0.07;
        if(getSaldoConta() >= valorTransferencia){
            setSaldoConta(getSaldoConta()-(valorTransferencia + (valorTransferencia*taxa)));
            conta.depositar(valorTransferencia);
            return true;
        }
        return false;
    }


}
