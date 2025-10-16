import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaPedidos {
    public static void main(String[] args) {

        ClientePF c1 = new ClientePF("Isadora Costa", "isa@gmail.com", "123.456.789-00");

        ClientePJ c2 = new ClientePJ("Joana Silva", "joana@gmail.com", "123.456.789-90");

        IPagamentos pag1 = new PagamentoCartao("987.654.321.111");

        IPagamentos pag2 = new PagamentoBoleto("444.333.222.111");


        Produto p1 = new Produto("Relógio", 100.00, 20);

        Produto p2 = new Produto("Pulseira", 50.00, 10);

        Produto p3 = new Produto("Colar", 1000, 20);

        Produto p4 = new Produto("Anel", 80.00, 10);

        ItemPedido i1 = new ItemPedido(p1, 1);
        ItemPedido i2 = new ItemPedido(p2, 3);
        ItemPedido i3 = new ItemPedido(p3, 2);


        //ped 150

        Pedido ped1 = new Pedido(LocalDate.now(), c1, pag1);
        ped1.adicionarItem(p1, 1);
        ped1.adicionarItem(p2, 1);

        System.out.println("------------------------------------------------------------------------------");

        ped1.processarPagamento();

        System.out.println("------------------------------------------------------------------------------");

        //ped 500

        Pedido ped2 = new Pedido(LocalDate.now(), c2, pag1);
        ped2.adicionarItem(p1, 3);
        ped2.adicionarItem(p2, 4);

        ped2.processarPagamento();

        System.out.println("------------------------------------------------------------------------------");
        //ped 800

        Pedido ped3 = new Pedido(LocalDate.now(), c1, pag2);
        ped3.adicionarItem(p4, 10);

        ped3.processarPagamento();

        System.out.println("------------------------------------------------------------------------------");
        //ped 150

        Pedido ped4 = new Pedido(LocalDate.now(), c2, pag2);
        ped4.adicionarItem(p3, 1);
        ped4.adicionarItem(p2, 10);

        ped4.processarPagamento();

        System.out.println("------------------------------------------------------------------------------");


    }
}