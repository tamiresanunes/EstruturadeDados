package Atividade 14;

public class LSE {
    private No inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(int info) {

        No novo = new No(info);
        if (inicio == null)
            inicio = novo;
        else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public boolean remove(int info) {
        No ant = null;
        No p = inicio;

        while (p != null && (int) p.getInfo() != info) {
            ant = p;
            p = p.getProximo();
        }

        if (p == null)
            return false;
        if (ant == null)
            inicio = p.getProximo();
        else
            ant.setProximo(p.getProximo());

        return true;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public int tamanho() {
        int cont = 0;
        for (No i = inicio; i != null; i = i.getProximo())
            cont++;
        return cont;
    }
}
