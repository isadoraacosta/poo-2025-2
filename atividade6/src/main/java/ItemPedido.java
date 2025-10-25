import poo.Produto;

public class ItemPedido {

    private Produto produto;
    private int quantidade;
    private double desconto = 0.0;


    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public double getSubtotal(){
        return produto.getPreco() * quantidade * produto.getPreco();
    }



}
