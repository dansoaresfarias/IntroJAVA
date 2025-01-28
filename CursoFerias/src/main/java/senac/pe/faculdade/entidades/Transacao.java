package senac.pe.faculdade.entidades;

import java.util.Date;

public class Transacao {
    private TipoTransacao tipo;
    private double valor;
    private Date data;
    private Conta contaTransferencia;
    private char tipoValor;

    public Transacao(TipoTransacao tipo, double valor, Date data, Conta contaTransferencia, char tipoValor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaTransferencia = contaTransferencia;
        this.tipoValor = tipoValor;
    }

    public Transacao(TipoTransacao tipo, double valor, Date data, char tipoValor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.tipoValor = tipoValor;
    }

    public Transacao() {}

    public TipoTransacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public Conta getContaTransferencia() {
        return contaTransferencia;
    }

    public char getTipoValor() {
        return tipoValor;
    }

    // toString()

    @Override
    public String toString() {
        return this.data.toLocaleString() + " \t " + this.tipo + " \t " +
                (this.tipo.equals(TipoTransacao.TRANSFERENCIA) ?
                        this.contaTransferencia.getAgencia().getNumero() + "|" +  this.contaTransferencia.getNumero() :
                            "       \t") + "\t\t\t" +
                ( this.tipoValor == '-' ? "\t\t" + this.tipoValor : "\t")
                + this.valor;
    }
}
