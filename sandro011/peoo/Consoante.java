public class Consoante {

    public static void main(String[] args) {
        ehVogal("Comida");
    }
    public static boolean ehVogal(String palavra) {
        int qtdDeConsoantes = 0;
        for(int i=0; i<palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                    return true;
            } else {
                qtdDeConsoantes++;
            }
        }
        System.out.println("A quantidade de consoantes é: " + qtdDeConsoantes);
        return false;
}
}
