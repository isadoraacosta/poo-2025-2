abstract class Cliente {

    String nome;
    String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
