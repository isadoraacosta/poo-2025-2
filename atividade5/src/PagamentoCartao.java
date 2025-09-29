public class PagamentoCartao implements IPagamentos {

    private String numeroCartao;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor >= 200) {
            System.out.println("ERRO : Valor do pedido ultrapassa o valor permitido (R$ 200.00).");
            return false;
        }else{
        System.out.println("Pagamento de R$ " + valor + " sendo processado via cartão de crédito.");
        return true;
        }
    }




}
