package senac.pe.faculdade.entidades;

import java.util.Date;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(Cliente cliente, int numero, Agencia agencia, Date dataAbertura, double saldo, boolean status, double limite) {
        super(cliente, numero, agencia, dataAbertura, saldo, status);
        this.limite = limite;
    }

    public ContaCorrente() {
        super();
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo + this.limite) {
            this.saldo -= valor; // this.saldo = this.saldo - valor;
            this.transacoes.add(new Transacao(TipoTransacao.SAQUE, valor, new Date(), '-'));
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
