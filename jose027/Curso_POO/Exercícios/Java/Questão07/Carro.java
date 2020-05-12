public class Carro extends Automovel {
    private int qtd_porta;

    public Carro(String marca, int qtd_rodas, String modelo, int velocidade, int qtd_porta) {
        this.setMarca(marca);
        this.setQtd_rodas(qtd_rodas);
        this.setModelo(modelo);
        this.setVelocidade(velocidade);
        this.qtd_porta = qtd_porta;
    }

    public int getQtd_porta() {
        return qtd_porta;
    }

    public void setQtd_porta(int qtd_porta) {
        this.qtd_porta = qtd_porta;
    }
}
