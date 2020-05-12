public class TesteContador {

    public static void main(String[] args) {

        Contador contador = new Contador();
        Contador contador2 = new Contador();
        contador.mostrarContador();
        contador.zerarContador();
        contador.mostrarContador();
        contador2.mostrarContador();
    }
}
