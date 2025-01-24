package senac.pe.faculdade.entidades;

public class Agencia {

    private int numero;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Agencia(int numero, String nome, String telefone, String email, Endereco endereco) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Agencia(int numero, String nome, String telefone, Endereco endereco) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Agencia() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Agencia: " + this.numero + " - " + this.nome + "\n" +
                "\tTelefone: " + this.telefone +
                (this.email != null ? " | Email: " + this.email : "") + "\n" +
                "\t" + this.endereco.toString();
    }
}
