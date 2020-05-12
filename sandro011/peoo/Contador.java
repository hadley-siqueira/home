public class Contador {

    static int cont = 0;

    public Contador() {
        cont++;
    }

    public void zerarContador() {
        cont = 0;
    }

    public void incrementarContador() {
        cont++;
    }

    public void mostrarContador() {
        System.out.println("Contagem: " + cont);
    }
}    
