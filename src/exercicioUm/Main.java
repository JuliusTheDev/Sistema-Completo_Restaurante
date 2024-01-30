package exercicioUm;

public class Main {
    public static void main(String[] args) {

        Banco novoBanco = new Banco("Banco do Brasil");

        ContaCorrente conta1 = new ContaCorrente(123456789, 1500.0, false, 500.0);
        novoBanco.adicionarConta(conta1);
        novoBanco.sacar(conta1, 500.0);
        System.out.println("Extrato da Conta 1:");
        novoBanco.imprimirExtrato(conta1);

        ContaCorrente conta2 = new ContaCorrente(987654321, 2000.0, true, 1000.0);
        novoBanco.adicionarConta(conta2);
        novoBanco.depositar(conta2, 1000.0);
        System.out.println("\nExtrato da Conta 2:");
        novoBanco.imprimirExtrato(conta2);

        System.out.println("\nMontante total do saldo do banco: " + novoBanco.getMontanteSaldo());
    }
}



