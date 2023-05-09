public class Main {
    public static void main(String[] args){
        Vetor vet = new Vetor();
        int vetor[] = new int[1000];


        for(int i = 0; i < vetor.length-1;i ++){
            vet.adiciona(vetor[i] = vet.preencher());
        }

        double start = System.currentTimeMillis();
        for(int i = 0; i < vetor.length-1; i++){
            vet.maximoRec(vetor, 0, vet.tamanho());
        }
        double elapsed = (System.currentTimeMillis() - start);
        System.out.println("Tempo de execução: " +elapsed);

        double start2 = System.currentTimeMillis();
        for(int i = 0; i < vetor.length-1; i++){
            vet.maximoIter();
        }
        double elapsed2 = (System.currentTimeMillis() - start2);
        System.out.println("Tempo de execução: " +elapsed2);
    }
}
