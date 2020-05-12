public class TestarInterruptor {
    public static void main(String[] args) {
        //Instanciamento do objeto
        Interruptor i = new Interruptor();
        i.ligado = false;
        
        //Chamada de funções
        i.pressionar();
        i.verificarLampada();
        i.pressionar();
        i.verificarLampada();
    }
}
