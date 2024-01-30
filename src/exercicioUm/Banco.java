package exercicioUm;

import java.util.ArrayList;
import exercicioUm.ContaCorrente;

public class Banco {
    private String nome;
    private ArrayList<ContaCorrente> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaCorrente conta) {
        contas.add(conta);
    }

    public void removerConta(ContaCorrente conta) {
        contas.remove(conta);
    }

    public void sacar(ContaCorrente conta, double valor) {
        Movimentacao movimentacaoDebito = new Movimentacao("Saque", valor, "Debito");
        conta.aplicar(movimentacaoDebito);
    }

    public void depositar(ContaCorrente conta, double valor) {
        Movimentacao movimentacaoCredito = new Movimentacao("Depósito", valor, "Crédito");
        conta.aplicar(movimentacaoCredito);
    }

    public void imprimirExtrato(ContaCorrente conta) {
        System.out.println("\n" + nome);
        System.out.println("Extrato da Conta: " + conta.getNumero());
        System.out.println("Movimentações:");

        for (Movimentacao movimentacao : conta.getMovimentacoes()) {
            System.out.println(movimentacao.toString());
        }

        System.out.println("Saldo Final: " + String.format("%.2f", conta.getSaldo()));
    }

    public double getMontanteSaldo() {
        double montanteSaldo = 0;

        for (ContaCorrente conta : contas) {
            montanteSaldo += conta.getSaldo();
        }

        return montanteSaldo;
    }

    public String getNome() { return nome; }

    public void setNome(String nome){ this.nome = nome; }

    public ArrayList<ContaCorrente> getContas(){return contas;}

    public void setContas(ArrayList<ContaCorrente> contas) {
        this.contas = contas;
    }


}