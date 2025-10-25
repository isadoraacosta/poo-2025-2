import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private LocalDate data;
    private String status;
    private List<ItemPedido> itens;
    private Cliente cliente;

    public Pedido(int numero, LocalDate data, String status, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {

        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public int getNumero() {
        return this.numero;
    }

    public LocalDate getData() {
        return this.data;
    }

    public String getStatus() {
        return this.status;
    }

    public List<ItemPedido> getItens() {
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }
}
