public class Calendario {
    int calendario[] = new int[12];
    String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public void gerarCalendario() {
        for (int c = 0; c < 12; c++) {
            if (meses[c].equals("Fevereiro") == false) {
                int mes[][] = new int[4][7];
                for (int cont = 0; cont < 4; cont++) {
                    for (contad  = 0; contad < 7; contad++) {
                        mes[cont][contad] = (cont + 1) * (contad + 1); 
                    }
                }
            } else {
            }
        }
    }
}

