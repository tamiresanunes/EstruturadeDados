public class FilaLDE implements IFilaLDE{

    private No inicio;
    private No fim;

    public FilaLDE() { // construtor
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean adicionar(Object info) { // insere
        No novo = new No(info);
        if (this.isEmpty()) {
            inicio = novo;
        } else
            fim.setproximo(novo);
        fim = novo;
        return true;
    }

    @Override
    public boolean excluir() { // remove
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getproximo();
            return true;
        }
        return false;
    }

    @Override
    public void exibir() { // imprime
        if (!isEmpty()) {
            No aux = inicio;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getproximo();
            }
        }
    }

    @Override
    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            No aux = inicio;
            while (aux != null) {
                cont++;
                aux = aux.getproximo();
            }
        }
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return (inicio == null);
    }

}
