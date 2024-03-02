package service;

import entity.ContaCorrente;

public interface OperacoesContaCorrenteService {

    double realizaDeposito(ContaCorrente contaCorrente, Double deposito);

    boolean realizaSaque(ContaCorrente contaCorrente, Double saque);

    default void imprimirSaldo(ContaCorrente contaCorrente){
        System.out.println("Seu saldo é: R$" + contaCorrente.getSaldo());
    }
}
