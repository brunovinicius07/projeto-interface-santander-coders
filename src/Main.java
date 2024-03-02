import entity.ContaCorrente;
import service.Impl.OperacoesContaCorrenteServiceImpl;
import service.OperacoesContaCorrenteService;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("1234", "56789", 1000.0);

        OperacoesContaCorrenteService contaCorrente = new OperacoesContaCorrenteServiceImpl();

        double valorDeposito = 500.0;
        System.out.println("Saldo antes do depósito: " + conta.getSaldo());
        contaCorrente.realizaDeposito(conta,valorDeposito);
        if (valorDeposito > 0){
            System.out.println("Depósito de R$"+valorDeposito +" realizado. Novo saldo: "+conta.getSaldo());
        }

        double valorSaque = 300.0;
        System.out.println("Saldo antes do saque: " + conta.getSaldo());
        contaCorrente.realizaSaque(conta, valorSaque);
        if (valorSaque < conta.getSaldo()) {
            System.out.println("Saque de R$" + valorSaque + " realizado. Novo saldo: " + conta.getSaldo());
        }

        contaCorrente.imprimirSaldo(conta);

    }
}