import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Pedido {

    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamentos metodoPagamento;

    public Pedido(LocalDate data, Cliente cliente, IPagamentos metodoPagamento) {
        this.data = data;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(Produto produto, int quantidade){

        this.itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public boolean processarPagamento() {
        double total = calcularTotal();
        return metodoPagamento.processarPagamento(total);
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }




}
