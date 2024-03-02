package service.Impl;

import entity.ContaCorrente;
import service.OperacoesContaCorrenteService;

public class OperacoesContaCorrenteServiceImpl implements OperacoesContaCorrenteService {

    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, Double deposito) {
        Double saldo = contaCorrente.getSaldo();

        if (deposito <= 0){
            System.out.println("O valor do depósito tem que ser maior que zero!");
        }else {
            contaCorrente.setSaldo(saldo + deposito);
        }

        return saldo;
    }

    public boolean realizaSaque(ContaCorrente contaCorrente, Double saque){
        if (saque > contaCorrente.getSaldo()){
            System.out.println("Você não tem saldo disponivel para saque, o seu saldo é de R$:" +
                    contaCorrente.getSaldo() + " e você esta tentando sacar R$:" + saque);
            return false;
        }else {
            Double saldo = contaCorrente.getSaldo();
            contaCorrente.setSaldo(saldo - saque);
            return true;
        }

    }
}
