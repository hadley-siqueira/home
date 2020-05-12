public class Pilha {
    private int vetor[];
    private int topo;

    public Pilha() {
        vetor = new int[10];
        topo = 0;
    }

    public void push(int elemento) {
        vetor[topo] = elemento;
        topo++;
    }

    public int pop() {
        int elem = vetor[topo - 1];
        topo--;
        return elem;
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public boolean isFull() {
        return (topo == 10); 
    }
}
