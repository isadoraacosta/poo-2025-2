import java.time.LocalDate;

public class Pedido{

    private int numero;
    private LocalDate data;
    private String status;

    public Pedido(int numero, LocalDate data, String status){
        this.numero = numero;
        this.status= status;
        this.data = data;
    }

    public int getNumero() {
        return this.numero;
    }

    public LocalDate getData(){
        return this.data;
    }

    public String getStatus(){
        return this.status;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setData(LocalDate data){
        this.data = data;
    }


    public void setStatus(String status){
        this.status = status;
    }









}