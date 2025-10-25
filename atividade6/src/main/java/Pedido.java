import poo.Produto;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Pedido {

    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamentos metodoPagamento;
    private String statusPedido = "PENDENTE";

    public Pedido(LocalDate data, Cliente cliente, IPagamentos metodoPagamento) {
        this.data = data;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade){
        boolean encontrado = false;
        for (ItemPedido item : itens) {
            if (item.getProduto().equals(produto)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            this.itens.add(new ItemPedido(produto, quantidade));
        }
    }

    public void removerItem(ItemPedido item){
        itens.remove(item);
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

    public void aplicarDesconto(double desconto){
        for (ItemPedido item : itens) {
            item.setDesconto(desconto);
        }
    }


    public boolean confirmarPedido() {
        if (!statusPedido.equals("PENDENTE")) {
            return false;
        }

        if (metodoPagamento == null) {
            return false;
        }

        boolean pagamentoOk = metodoPagamento.processarPagamento(this.calcularTotal());
        if (pagamentoOk) {
            statusPedido = "PROCESSANDO";
        } else {
            statusPedido = "PENDENTE";
        }

        return pagamentoOk;
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

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setMetodoPagamento(IPagamentos metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
