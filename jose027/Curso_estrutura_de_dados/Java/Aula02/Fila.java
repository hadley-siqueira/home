public class Fila {
    private int inicio;
    private int fim;
    public int vetor[] = new int[10];

    public Fila() {
        this.inicio = 0;
        this.fim = 0;
    }

    public void push(int elemento) {
        if (isFull() == true) {
            this.pop();
        }
        vetor[fim] = elemento;
        fim++;
    }

    public int pop() {
        int retirado = vetor[inicio];
        for (int c = 1; c < fim; c++) {
            vetor[c - 1] = vetor[c];
        }
        this.fim--;
        return retirado;
    }

    public boolean isFull() {
        if (this.fim == this.vetor.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (this.fim == 0) {
            return true;
        }
        return false;
    }
}

   
