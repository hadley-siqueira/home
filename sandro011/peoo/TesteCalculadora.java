public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,4));
        System.out.println(calculadora.subtrair(5, 3));
        System.out.println(calculadora.dividir(50, 5));
        System.out.println(calculadora.multiplicar(50, 5));
        
    }
}
