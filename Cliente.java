public abstract class Cliente {
    protected String nome;
    protected String CNPJ;
    protected String endereco;

    public Cliente(String nome, String CNPJ, String endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }

    public abstract String getTipoCliente();

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getEndereco() {
        return endereco;
    }
}