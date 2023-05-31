public class Main {
    public static void main(String[] args) {

        IFilaLDE fila = new FilaLDE();
        fila.adicionar("Jose");
        fila.adicionar("Maria");
        fila.adicionar("Pedro");
        fila.adicionar("Ana");
        fila.adicionar("Leticia");
        fila.adicionar("Gabriele");
        fila.adicionar("t");
        System.out.println("Imprimindo fila:");
        fila.exibir();
        System.out.println("Tamanho da fila: " + f.size());
        System.out.println("----------------------------");
        System.out.println("Removendo elemento da fila:");
        fila.excluir();
        fila.exibir();
        System.out.println("Tamanho da fila: " + f.size());

    }

}
