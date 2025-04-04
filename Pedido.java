public class Pedido {
    private int id;
    private Cliente cliente;
    private enum FormaMassa {
        SPAGHETTI,
        CANELONE,
        TALHARIM
    }
    private int quantidade;
    private double valorTotal;
}