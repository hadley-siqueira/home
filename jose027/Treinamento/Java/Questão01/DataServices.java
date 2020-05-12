public class DataServices {
    public boolean validacaoData(Agenda a, Data dat) {
        if (a.getDia() <= 0 || (a.getDia() < dat.dia && a.getAno() < dat.ano)) {
            System.out.print("Dia digitado inválido");
            return false;
        }
        
        if (a.getMes() < dat.mes && a.getAno() <= dat.ano) {
            System.out.println("Mês digitado inválido");
            return false;
        }

        if (a.getAno() < dat.ano) {
            System.out.println("Ano digitado inválido");
            return false;
        }
        return true;
    }
}
