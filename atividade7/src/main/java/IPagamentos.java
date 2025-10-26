public interface IPagamentos {

    public boolean processarPagamento(double valor);

    public StatusPagamento getStatus(); //
}
