import java.time.LocalDate;

public class Pedido {

    private int numero;
    private LocalDate data;
    private String status;
    private ItemPedido[] itens;

    public Pedido(int numero, LocalDate data, String status, ItemPedido[] itens) {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.itens = itens;
    }

    public Pedido() {}

    public int getNumero() {
        return this.numero;
    }

    public LocalDate getData() {
        return this.data;
    }

    public String getStatus() {
        return this.status;
    }

    public ItemPedido[] getItens() {
        return this.itens;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }


    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < itens.length; i++) {
                total += itens[i].getSubtotal();
        }
        return total;
    }
}
