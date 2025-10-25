public class PagamentoBoleto implements IPagamentos {

    private String codBarras;
    private StatusPagamento statusPagamento;


    public String getcodBarras() {
        return codBarras;
    }

    public void setcodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public PagamentoBoleto(String codBarras) {
        this.codBarras = codBarras;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    @Override
    public StatusPagamento getStatus() {
        return this.statusPagamento;
    }


    @Override
    public boolean processarPagamento(double valor) {
        if (valor >= 1000) {
            System.out.println("ERRO: Valor do pedido ultrapassa o valor permitido (R$ 1000.00).");
            this.statusPagamento = StatusPagamento.RECUSADO; // 👈 adiciona isso
            return false;
        } else {
            System.out.println("Pagamento de R$ " + valor + " sendo processado via boleto bancário.");
            this.statusPagamento = StatusPagamento.APROVADO; // 👈 adiciona isso
            return true;
        }
    }





}
