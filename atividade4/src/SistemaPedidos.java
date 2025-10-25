import java.time.LocalDate;

public class SistemaPedidos {
    public static void main(String[] args) {

        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10);
        Produto mousepad = new Produto("Mouse Pad Preto", 8.90);
        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69.00);

        ClientePF cliente1 = new ClientePF("Isadora Costa", "isa@email.com", "123.456.789-00");

        ClientePJ cliente2 = new ClientePJ("Maria Silva", "maria@email.com", "234.567.890-11");

        Pedido p1 = new Pedido(1, LocalDate.now(), "Em andamento", cliente1);

        Pedido p2 = new Pedido(2, LocalDate.now(), "Em andamento", cliente2);

        p1.adicionarItem(teclado, 1);
        p1.adicionarItem(mousepad, 2);
        p1.adicionarItem(mouse, 2);


        System.out.printf("O valor total do primeiro pedidio é: R$ %.2f%n", p1.calcularTotal());

        System.out.printf("O valor total do segundo pedido é : R$ %.2f%n", p2.calcularTotal());
    }
    }

