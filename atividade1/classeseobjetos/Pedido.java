import java.time.LocalDate;

public class Pedido{

    int numero;
    LocalDate data;
    String status;

    void imprime_pedido(){

        System.out.println("Numero: " + this.numero);

        System.out.println("Data: " + this.data);

        System.out.println("Status: " + this.status);


    }


}