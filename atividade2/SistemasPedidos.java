import java.time.LocalDate;

public class SistemasPedidos{

    public static void main(String[] args){

        Cliente cliente = new Cliente("Isadora Costa", "isadora_nascimento@discente.ufg.br");

        Produto produto1 = new Produto("Caderno", 50.00);

        produto1.adicionarEstoque(5);

        Pedido pedido = new Pedido(123, LocalDate.now(), "processando");
        System.out.println("------------------------------------------------------------------");

        System.out.println("Dados do cliente: ");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Nome do cliente: " +cliente.getNome());

        System.out.println("Email do cliente: " +cliente.getEmail());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Dados do produto: ");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Nome do produto: " + produto1.getNome());

        System.out.println("Estoque do produto: " + produto1.getEstoque());

        System.out.println("Preço do produto: " + produto1.getPreco());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Dados do pedido: ");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Numero do pedido: " + pedido.getNumero());

        System.out.println("Status do pedido: " + pedido.getStatus());

        System.out.println("Data do pedido: " + pedido.getData());

        System.out.println("------------------------------------------------------------------");

        System.out.println("\nAtualizando os dados do sistema:\n");

        System.out.println("------------------------------------------------------------------");

        cliente.setNome("Isa Nascimento");

        cliente.setEmail("isa@gmail.com");

        produto1.setNome("Óculos");

        produto1.setPreco(100.00);

        produto1.setEstoque(10);

        pedido.setNumero(1020);

        pedido.setStatus("Realizado");

        System.out.println("Novos dados do cliente: ");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Nome do cliente: " +cliente.getNome());

        System.out.println("Email do cliente: " +cliente.getEmail());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Novos dados do produto: ");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Nome do produto: " + produto1.getNome());

        System.out.println("Estoque do produto: " + produto1.getEstoque());

        System.out.println("Preço do produto: " + produto1.getPreco());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Novos dados do pedido: ");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Numero do pedido: " + pedido.getNumero());

        System.out.println("Status do pedido: " + pedido.getStatus());

        System.out.println("Data do pedido: " + pedido.getData());

        System.out.println("------------------------------------------------------------------");


















    }
}