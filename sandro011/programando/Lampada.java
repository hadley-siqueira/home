public class Lampada {

    boolean ligada;
    double potencia;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public boolean estahLigada() {
        return this.ligada;
    }
}
