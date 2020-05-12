public class Moto extends Automovel {
    private boolean partida_eletrica;

    public Moto(String marca, int qtd_rodas, String modelo, int velocidade, boolean partida_eletrica) {
        this.setMarca(marca);
        this.setQtd_rodas(qtd_rodas);
        this.setModelo(modelo);
        this.setVelocidade(velocidade);
        this.partida_eletrica = partida_eletrica;
    }

    public boolean getPartida_eletrica() {
        return partida_eletrica;
    }

    public void setPartida_eletrica(boolean partida_eletrica) {
        this.partida_eletrica = partida_eletrica;
    }
}
