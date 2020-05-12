public class Trheads extends Thread {
    private String nome;
    private int tempo;
    public Trheads(String n, int t) {
        this.nome = n;
        this.tempo = t;
        start();
    }

    public void run() {
        for (int c = 0; c < 5; c++) {
            System.out.println("Executando a thread " + this.nome);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();        
            }
        }
    }
}

    
