public class Corredor {
    private String nome;
    private String sexo;
    private double tempo_de_corrida;

    public Corredor(String nome, String sexo, double tempo_de_corrida) {
        this.nome = nome;
        this.sexo = Character.toString(sexo.charAt(0));
        this.tempo_de_corrida = tempo_de_corrida;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
   }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = Character.toString(sexo.charAt(0));
    }

    public double getTempo() {
        return this.tempo_de_corrida;
    }

    public void setTempo(double tempo_de_corrida) {
        this.tempo_de_corrida = tempo_de_corrida;
    }
}

