public class LDEObject <T>{
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public LDEObject(){
    this.inicio = null;
    this.inicio = null;
    }

    public void adiciona(T elemento){
    No<T> celula = new No<T>(elemento);
    if (this.tamanho == 0) {
        this.inicio = celula;
    } else {
        this.ultimo.setProximo(celula);
    }
    this.ultimo = celula;
    this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void imprimirComeco() {
        No<T> atual = this.inicio;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }

    public void imprimirFinal() {
        No<T> atual = this.ultimo;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getAnterior();
        }
    }
/*
    @Override
    public String toString() {
        // [1, 2, 3, 4]

        if (this.tamanho == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        // builder.append("ListaEncadeada [inicio=").append(inicio).append("]");
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }*/
}

