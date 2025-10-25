import java.time.LocalDate;
public class SistemaPedidos {

    public static void main(String[] args) {

        Produto teclado = new Produto("Fortrek Teclado Gamer BLACK EAGLE",79.10);

        Produto mousepad = new Produto("Mouse Pad Preto", 8.90);

        Produto mouse = new Produto("Mouse Dell sem fio - WM118", 69.00);

        ItemPedido itemteclado = new ItemPedido(teclado, 1);

        ItemPedido itemmousepad = new ItemPedido(mousepad, 2);

        ItemPedido  itemmouse= new ItemPedido(mouse, 2);

        ItemPedido[] itens = { itemteclado, itemmousepad, itemmouse };
        Pedido p1 = new Pedido(1, LocalDate.now(), "Em andamento", itens);

        System.out.printf("O valor total da compra: (R$ %.2f)%n", p1.calcularTotal());


        //saida formatada: System.out.printf("preco1: %.2f", preco1);

        //contrutor padrao é o que nao recebe nenhum paramentro

    }
}