public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada<Integer>();
        lista.adiciona(1);

        System.out.println("Tamanho= " +lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);

    }

}
