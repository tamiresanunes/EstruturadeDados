package Trabalho2.Palindromo;

public class PilhaV{
private Object[] pilha;
    private int numElem;
    private boolean isEmpty;
    private String plvOriginal;
    
    public PilhaV(int tamanhoV, String plvOriginal) { // construtor
        this.pilha = new Object[tamanhoV];
        this.numElem = 0;
        this.plvOriginal = plvOriginal;
    }
    
    public boolean push(Object info) { // empilha elementos na pilha
        if (this.numElem == pilha.length) {
            System.out.println("A pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }
    
    public Object pop() { // desempilha, retira os elementos da pilha
        Object o = null;
        if (this.isEmpty) {
            System.out.println("A pilha está vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }
    
    public boolean isEmpty() {// verifica se a pilha está vazia ou não
        return numElem == 0;
    }
    
    public void exibirPilha() {// exibe os elementos da pilha
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");// se a pilha estiver vazia
            return;
        }
        
        System.out.println("Elementos que estão na pilha:");// se tiver elementos na pilha
        
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
    
   /*public void comparar() {
        StringBuilder plvPilha = new StringBuilder();
        
        for (int i = numElem - 1; i >= 0; i--) {
            plvPilha.append(pilha[i]);
        }
        
        String plvPilhaString = plvPilha.toString();
        exibirPilha();
        System.out.println("Palavra Original: " + plvOriginal);
        System.out.println("Palavra na Pilha: " + plvPilhaString);
        
        if (plvOriginal.equals(plvPilhaString)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndomo.");
        }
    }*/

    public void comparar() {//faz a comparação dos elementos da pilha para ver se a palavra é um palíndromo ou não
        StringBuilder plvPilha = new StringBuilder();
        
        for (int i = numElem - 1; i >= 0; i--) {
            plvPilha.append(pilha[i]);
        }
        
        String palavraPilhaS = plvPilha.toString();
        exibirPilha();
        System.out.println("Palavra Original: " + plvOriginal);
        System.out.println("Palavra na Pilha: " + palavraPilhaS);
        
        if (plvOriginal.equals(palavraPilhaS)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}

