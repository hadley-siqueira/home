public class QuickSort {
    private int vetor[] = {};
    private int referencia, pivo, up, down;

    public void partition() {
        referencia = vetor[0];
        down = 0;
        up = vetor.length - 1;

        while (vetor[down] <= referencia) {
            down++;
        }        

        while (vetor[up] > referencia) {
            up--;
        }
    }

    public void quickSort() {
    }
}
