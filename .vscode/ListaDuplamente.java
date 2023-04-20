public class ListaDuplamente implements ILista {
    private No primeiro;
    private No ultimo;
    private int totalNos;

    public ListaDuplamente() {
        this.primeiro = null;
        this.ultimo = null;
        this.totalNos = 0;
    }

    public void adicionar(int valor) {
        No novo = new No(valor);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            for (novo = primeiro; novo != null; novo = novo.getProximo()) {
                if (novo.getValor() > valor) {
                    novo.setProximo(primeiro);
                    primeiro.setAnterior(novo);
                    primeiro = novo;
                }
            }
        }

    }
    public void inserirComeco(int valor) {
        No novo = new No(valor);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            primeiro = novo;
        }
        totalNos++;
    }

    public void inserirFinal(int valor) {
        No novo = new No(valor);
        if (ultimo == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }

    public int tamanho() {
        return this.totalNos;
    }

    /*
     * public No busca(int a) {
     * No retorno = null;
     * for(No i = primeiro; i != null; i = i.getProximo()){
     * if(i.getValor() == a){
     * retorno = i;
     * }
     * }
     * return retorno;
     * }
     */

    public boolean remove(int valor) {
        No p = busca(valor);
        if (p == null) {
            return false;
        }
        if (p.getAnterior() == null) {
            primeiro = p.getProximo();
            if (primeiro != null)
                primeiro.setAnterior(null);
        } else if (p.getProximo() == null) { // info estah no fim
            p.getAnterior().setProximo(null);
            ultimo = p.getAnterior();
        } else { // info estah no meio
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }

    public No busca(int valor) {
        No atual = primeiro;
        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }
        return atual;
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        }
        return false;
    }

    public void listarProximo() {
        for (No i = primeiro; i != null; i = i.getProximo()) {
            System.out.println(i.getValor());
        }
    }
    public void listarAnterior() {
        for (No i = ultimo; i != null; i = i.getAnterior()) {
            System.out.println(i.getValor());
        }
    }

    public void imprime() {
        No atual = primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();

        atual = ultimo;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
/* 
    @Override
    public String toString() {

        if (this.tamanho() == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        // builder.append("ListaDuplamente [primeiro=").append(primeiro).append("]");
        No atual = this.primeiro;
        for (int i = 0; i < this.tamanho() - 1; i++) {
            builder.append(atual.getValor()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getValor()).append("]");
        
        return builder.toString();
    }*/
    
}
