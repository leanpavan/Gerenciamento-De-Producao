public class Restaurante extends Cliente {
    public Restaurante(String nome, String cnpj, String endereco) {
        super(nome, cnpj, endereco);
    }

    @Override
    public String getTipoCliente() {
        return "restaurante";
    }

}