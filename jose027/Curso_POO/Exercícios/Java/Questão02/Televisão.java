public class Televisão {
    private boolean ligada;
    private int canal;
    public final String canais[] = {"Globo", "Record", "Band", "RedeTV", "SBT"};
    private int volume;

    public Televisão(boolean l, int c, int v) {
        this.ligada = l;
        this.canal = c;
        this.volume = v;
    }

    public boolean getLigada() {
        return ligada;
    }
    
    public void setLigada(boolean l) {
        this.ligada = l;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int c) {
        this.canal = c;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public void imprimirInformacoes() {
        if (ligada == false) {
            System.out.println("Ligada: " + this.ligada);
        } else {
            System.out.println("Ligada: " + this.ligada + "\nCanal: " + this.canais[canal - 1] + "\nVolume: " + this.volume);
        }
    }

    public void amostraVolume() {
        System.out.println("Volume: " + this.volume);
        for (int cont = 0; cont < this.volume; cont++) {
            System.out.print("|");
        }
        System.out.println();
    }
}
