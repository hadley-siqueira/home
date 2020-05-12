public class TestarProduto {
    public static void main(String[] args) {
        //Instanciamento de objeto
        Produto p1 = new Produto("Notebook", 999);
        //Chamada de funções
        p1.informarNome();
        p1.informarPreco();
        p1.fazerPromocao();
        p1.informarPreco();
    }
}
