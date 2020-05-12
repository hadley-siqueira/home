public class Interruptor {
    public boolean ligado;

    public boolean pressionar() {
        if (this.ligado == false) {
            return this.ligado = true;
        } else {
            return this.ligado = false;
        }
    }

    public void verificarLampada() {
        if (this.ligado == true) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
