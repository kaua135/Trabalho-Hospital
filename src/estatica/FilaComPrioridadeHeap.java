package estatica;

public class FilaComPrioridadeHeap<T extends Comparable<T>> {

    private T[] elementos;
    private int tamanho;

    public FilaComPrioridadeHeap(int capacidade) {
        elementos = (T[]) new Comparable[capacidade];
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void enfileirar(T elemento) {

        if (tamanho == elementos.length) {
            throw new RuntimeException("Heap cheia");
        }

        elementos[tamanho] = elemento;

        sobeHeap(tamanho);

        tamanho++;
    }

    private void sobeHeap(int indice) {

        while (indice > 0) {

            int pai = (indice - 1) / 2;

            if (elementos[indice].compareTo(elementos[pai]) > 0) {

                trocar(indice, pai);

                indice = pai;

            } else {
                break;
            }
        }
    }

    public T desenfileirar() {

        if (estaVazia()) {
            throw new RuntimeException("Heap vazia");
        }

        T raiz = elementos[0];

        elementos[0] = elementos[tamanho - 1];

        elementos[tamanho - 1] = null;

        tamanho--;

        desceHeap(0);

        return raiz;
    }

    private void desceHeap(int indice) {

        while (true) {

            int esquerda = 2 * indice + 1;
            int direita = 2 * indice + 2;

            int maior = indice;

            if (esquerda < tamanho &&
                elementos[esquerda].compareTo(elementos[maior]) > 0) {

                maior = esquerda;
            }

            if (direita < tamanho &&
                elementos[direita].compareTo(elementos[maior]) > 0) {

                maior = direita;
            }

            if (maior != indice) {

                trocar(indice, maior);

                indice = maior;

            } else {
                break;
            }
        }
    }

    private void trocar(int a, int b) {

        T temp = elementos[a];
        elementos[a] = elementos[b];
        elementos[b] = temp;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[ ");

        for (int i = 0; i < tamanho; i++) {

            sb.append(elementos[i]);

            if (i < tamanho - 1) {
                sb.append(" , ");
            }
        }

        sb.append(" ]");

        return sb.toString();
    }
}