public class Chapa {

    int numero;
    String nome;
    int votosAlu;
    int votosProf;
    int votosTec;

    int pegarTodosOsAlunos() {
        return votosAlu + votosProf + votosTec;
    }
