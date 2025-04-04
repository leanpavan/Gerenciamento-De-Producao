public class Supermecado extends Cliente {
    public Supermecado(String nome, String cnpj, String endereco) {
        super(nome, cnpj, endereco);
    }
    @Override
    public String getTipoCliente() {
        return "supermecado";
    }
}