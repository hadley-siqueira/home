public class Controle {
    public void LigarDesligar(String a, Televisão t) {
        if (a.equalsIgnoreCase("Desligar")) {
            if (t.getLigada() == false) {
                System.out.println("A televisão já está desligada");
            } else {
                t.setLigada(false);
            }
        } else if (a.equalsIgnoreCase("Ligar")) {
            if (t.getLigada() == true) {
                System.out.println("A televisão já está ligada");
            } else {
               t.setLigada(true);
            }
        }
    }

   public void aumentarVolume(Televisão t) {
        if (t.getLigada() == true && (t.getVolume() >= 0 && t.getVolume() < 50)) {
            t.setVolume(t.getVolume() + 5);
        } else if (t.getLigada() == false) {
            System.out.println("Não foi possível aumentar o volume, porque a televisão está desligada");
        }
        t.amostraVolume();
    }

    public void diminuirVolume(Televisão t) {
        if (t.getLigada() == true && (t.getVolume() > 0 && t.getVolume() <= 50)) {
            t.setVolume(t.getVolume() - 5);
        } else if (t.getLigada() == false) {
            System.out.println("Não foi possível diminuir o volume, porque a televisão está desligada");
        }
        t.amostraVolume();
    }

    public void mudarCanal(Televisão t, int c) {  
        if (c <= 0 || c > 5) {
            System.out.println("O canal não existe");
        }
        System.out.println("A televisão está no canal " + t.canais[c - 1]);        
    }
}
