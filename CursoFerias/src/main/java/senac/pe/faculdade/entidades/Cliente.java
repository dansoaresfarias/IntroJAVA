package senac.pe.faculdade.entidades;

import java.util.Date;

public class Cliente {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private int rg;
    private String email;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Date dataNascimento, int rg, String email, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpf, Date dataNascimento, int rg, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.cpf + " | " + this.nome + "\n" +
                "\tRG: " + this.rg  + " | " + "Data Nasc: " + this.dataNascimento.toLocaleString() +
                " | Telefone: " + this.telefone +
                (this.email != null ? " | Email: " + this.email : "") + "\n" +
                "\t" + this.endereco.toString();
    }
}
