public class Main {
    public static void main(String[] args) {
        IFilaVetor fila = new FilaVetor(8);
        fila.adiciona(2);
        fila.adiciona(9);
        fila.adiciona(0);
        fila.adiciona(6);
        fila.adiciona(2);
        fila.adiciona(0);
        fila.adiciona(0);
        fila.adiciona(1);
        fila.excluir();
        fila.exibir();
    }
}
