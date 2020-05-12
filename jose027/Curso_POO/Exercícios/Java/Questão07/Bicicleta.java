public class Bicicleta extends Veiculo {
    private int num_marcha;
    private boolean bagageiro;

    public Bicicleta(String marca, int qtd_rodas, String modelo, int velocidade, int num_marcha, boolean bagageiro) {
        this.setMarca(marca);
        this.setQtd_rodas(qtd_rodas);
        this.setModelo(modelo);
        this.setVelocidade(velocidade);
        this.num_marcha = num_marcha;
        this.bagageiro = bagageiro;
    }
}
