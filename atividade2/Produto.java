public class Produto{

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }


    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public void adicionarEstoque(int estoque){
        if(this.estoque >= 0){
            this.estoque += estoque;
        }else{
            System.out.println("Só é possível adicionar se a quantidade em estoque for positiva!");
        }

    }


//    void imprime_produto() {
//        System.out.println("Nome: " + this.nome);
//        System.out.println("Preço: " + this.preco);
//        System.out.println("Estoque: " + this.estoque);
//    }

}


