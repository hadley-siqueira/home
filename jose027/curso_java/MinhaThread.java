public class MinhaThread extends Thread {   
    private String nome;
    private int tempo; 
        
    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    } 
    
    public void run() {
        try {
            for (int c = 0; c < 5; c++) { 
                System.out.println("Executando a " + this.nome + " contador " + (c + 1));
                Thread.sleep(tempo);
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}

