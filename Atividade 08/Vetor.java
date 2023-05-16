import java.util.Random;

public class Vetor {
    private int[] array = new int[0];
    private int totalNumeros = 0;
    private int begin;
    private int end;
    private int mid;

    public Vetor(){
        this.array = new int[5];
    }

    public void add(int number){
        if (totalNumeros == array.length){
            return;
        }

        this.array[this.totalNumeros] = number;
        this.totalNumeros++;
    }   

    public int size(){
        return this.totalNumeros;
    }

    public int maxRec(int array[], int begin, int end){
        if (begin == end){
            return array[begin];
        }
        else {
            mid = (begin + end) / 2;
            int max1 = maxRec(array, begin, mid);
            int max2 = maxRec(array, mid+1, end);
            if (max1 > max2) {
                return max1;
            }
            else {
                return max2;
            }
        }
    }
    
    public int maxIt(int number){
        int maior = 0; 

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
    
        return maior;
    }

    public int[] gerarVetorAleatorio() {
        int[] vetor = new int[1000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(999999);
        }

        return vetor;
    }

    public int[] geraVetorSequencial(){
        int[] vetor = new int[1000];

        for (int i = 0; i < 1000; i++) {
            vetor[i] = i + 1;
        }

        return vetor;
    }

    public boolean itBinarySearch(int number){
        begin = 0;
        end = array.length - 1;
    
        while (begin <= end){
            mid = (begin + end) / 2;
            if (array[mid] == number){
                return false;
            }
            else if (array[mid] < number){
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return true;
    }

    public static boolean recursiveBinarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return false; // valor não encontrado
        }
        int mid = (left + right) / 2;
        if (array[mid] == value) {
            return true; // valor encontrado
        } else if (array[mid] > value) {
            return recursiveBinarySearch(array, value, left, mid - 1); // procurar na metade esquerda
        } else {
            return recursiveBinarySearch(array, value, mid + 1, right); // procurar na metade direita
        }
    }

}
