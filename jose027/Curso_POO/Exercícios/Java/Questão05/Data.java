public class Data {
    private int dia, mes, ano;

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    public void escreverData() {
        System.out.printf("%02d/%02d/%d\n", this.dia, this.mes, this.ano);
    }

    public void escreverMes() {
        String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        for (int c = 0; c < 12; c++) {
            if (this.mes - 1 == c) {
                System.out.println(meses[c]);
            }
        }        
    }
}
