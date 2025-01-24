package senac.pe.faculdade.entidades;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco(String rua, String bairro, String cidade, String uf, int numero,
                    String complemento, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public Endereco(String rua, String bairro, String cidade, String uf, int numero, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco: " +
                this.cidade + "-" + this.uf + ", " + this.bairro + ", " +
                this.rua + ", " + this.numero + ", " +
                (this.complemento != null ? this.complemento + ", " : "") + this.cep;
    }
}
