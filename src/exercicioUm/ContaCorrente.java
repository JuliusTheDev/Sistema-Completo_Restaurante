package exercicioUm;

import exercicioUm.Movimentacao;
import java.util.ArrayList;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limiteCredito;
    private ArrayList<Movimentacao> movimentacoes;

    public ContaCorrente(int numero, double saldo, boolean especial, double limiteCredito) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteCredito = limiteCredito;
        this.movimentacoes = new ArrayList<>();
    }
    public void aplicar(Movimentacao movimentacao) {
        if (movimentacao.getTipo().equals("Débito")) {
            double saldoDisponivel = saldo + limiteCredito;
            if (movimentacao.getValor() <= saldoDisponivel) {
                movimentacoes.add(movimentacao);
                saldo -= movimentacao.getValor();
            } else {
                System.out.println("Nao eh possivel realizar a movimentacao de debito. Saldo insuficiente.");
            }
        } else {
            movimentacoes.add(movimentacao);
            saldo += movimentacao.getValor();
        }
    }

    public ArrayList<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public void setMovimentacoes(ArrayList<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
}


