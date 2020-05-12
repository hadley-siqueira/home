public class Produto {
    private String nome;
    private double preco;

    public Produto(String n, double p) {
        this.nome = n;
        this.preco = p;
    }

    public void informarNome() {
        System.out.println("O nome do produto é " + this.nome);
    }

    public void informarPreco() {
        System.out.println("O preço do produto é " + this.preco);
    }

    public void fazerPromocao() {
        this.preco -= this.preco * 0.1;
    }
}
