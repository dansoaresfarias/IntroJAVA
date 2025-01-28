package senac.pe.faculdade.entidades;

import java.util.Date;

public class Poupanca extends Conta {

    private double taxaJuros;

    public Poupanca(Cliente cliente, int numero, Agencia agencia, Date dataAbertura, double saldo, boolean status, double taxaJuros) {
        super(cliente, numero, agencia, dataAbertura, saldo, status);
        this.taxaJuros = taxaJuros;
    }

    public Poupanca() {
        super();
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            valor = valor * this.taxaJuros;
            this.saldo += valor; // this.saldo = this.saldo + valor;
            this.transacoes.add(new Transacao(TipoTransacao.DEPOSITO, valor, new Date(), '+'));
            return true;
        } else {
            return false;
        }
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
