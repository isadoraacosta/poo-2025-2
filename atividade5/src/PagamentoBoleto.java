public class PagamentoBoleto implements IPagamentos {

    private String codBarras;

    public String getcodBarras() {
        return codBarras;
    }

    public void setcodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public PagamentoBoleto(String codBarras) {
        this.codBarras = codBarras;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor >= 1000) {
            System.out.println("ERRO: Valor do pedido ultrapassa o valor permitido (R$ 1000.00).");
            return false;
        }else{
            System.out.println("Pagamento de R$ " + valor + " sendo processado via boleto bancário.");
            return true;
        }
    }




}
