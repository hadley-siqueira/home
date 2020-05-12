public abstract class Veiculo {
    private String marca;
    private int qtd_rodas;
    private String modelo;
    private int velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca =  marca;
    }

    public int getQtdRodas() {
        return qtd_rodas;
    }

    public void setQtd_rodas(int qtd_rodas) {
        this.qtd_rodas = qtd_rodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int aceleracao) {
        this.velocidade += aceleracao;
    }

    public void frear(int reducao) {
        this.velocidade -= reducao;
    }
}
