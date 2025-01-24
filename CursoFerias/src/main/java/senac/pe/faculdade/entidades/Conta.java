package senac.pe.faculdade.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Conta {

    private Cliente cliente;
    private int numero;
    private Agencia agencia;
    private Date dataAbertura;
    private double saldo;
    private boolean status;
    private ArrayList<Transacao> transacoes;

    public Conta(Cliente cliente, int numero, Agencia agencia, Date dataAbertura, double saldo, boolean status) {
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.status = status;
        this.transacoes = new ArrayList<Transacao>();
    }

    public Conta() {
    }

    //depositar
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor; // this.saldo = this.saldo + valor;
            this.transacoes.add(new Transacao(TipoTransacao.DEPOSITO, valor, new Date(), '+'));
            return true;
        } else {
            return false;
        }
    }
    //sacar
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor; // this.saldo = this.saldo - valor;
            this.transacoes.add(new Transacao(TipoTransacao.SAQUE, valor, new Date(), '-'));
            return true;
        }else {
            return false;
        }
    }

    //transferir

    //realizarPix

    //imprimirExtrato

    //toString

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
}
