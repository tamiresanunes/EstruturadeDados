public interface ILista {
    public void adicionar(int valor);
    public void inserirComeco(int valor);
    public void inserirFinal(int valor);
    public int tamanho();
    public boolean remove(int valor);
    public No busca(int valor);
    public boolean estaVazia();
    public void listarProximo();
    public void listarAnterior();
    public void imprime();

}
