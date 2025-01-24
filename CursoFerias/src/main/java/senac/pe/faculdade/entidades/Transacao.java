package senac.pe.faculdade.entidades;

import java.util.Date;

public class Transacao {
    private TipoTransacao tipo;
    private double valor;
    private Date data;
    private Cliente clienteTransferencia;
    private char tipoValor;

    public Transacao(TipoTransacao tipo, double valor, Date data, Cliente clienteTransferencia, char tipoValor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.clienteTransferencia = clienteTransferencia;
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

    public Cliente getClienteTransferencia() {
        return clienteTransferencia;
    }

    public char getTipoValor() {
        return tipoValor;
    }
}
