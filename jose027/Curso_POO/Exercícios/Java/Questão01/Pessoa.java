import java.util.Calendar;
public class Pessoa {
    private String nome;
    private String d_nascimento;
    private double altura;

    Calendar c = Calendar.getInstance();
    int dia = c.get(Calendar.DAY_OF_MONTH);
    int mes = c.get(Calendar.MONTH) + 1;
    int ano_atual = c.get(Calendar.YEAR);

    public Pessoa(String n, String d, double a) {
        this.nome = n;
        this.d_nascimento = d;
        this.altura = a;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getD_nascimento() { 
        return d_nascimento;
    }

    public void setD_nascimento(String d) {
        this.d_nascimento = d;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public int calcularIdade() {
        Integer ano_nascimento = new Integer(d_nascimento.substring(6));         
        return ano_atual - ano_nascimento;
    } 

    public void imprimirDados() {   
        System.out.println("*** Dados ***");
        System.out.println("Nome: " + this.nome + "\nNascimento: " + this.d_nascimento + "\nAltura: " + this.altura);
        System.out.println("Idade: " + this.calcularIdade() + " anos");
    } 
 
    public void fazerAniversario() {
        Integer dia_nasc = new Integer(d_nascimento.substring(0, 2));
        Integer mes_nasc = new Integer(d_nascimento.substring(4, 5));
        if (dia == dia_nasc && mes == mes_nasc) {
            System.out.println(this.nome + " Completou aniversário hoje!!!");
            System.out.println("Idade: " + (this.calcularIdade() + 1) + " anos de idade");
        } else {
            System.out.println(this.nome + " Não completou aniversário hoje");
        }
    }
}
