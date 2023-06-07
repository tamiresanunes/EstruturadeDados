package Trabalho2.Alunos;

public class PilhaV {
    private Object[] pilha;
    private int numElem;
    private boolean isEmpty;
    
    public PilhaV(int tamanhoV) { // construtor
        this.pilha = new Object[tamanhoV];
        this.numElem = 0;
    }
    
    public boolean push(Object info) { // empilha os elementos
        if (this.numElem == pilha.length) {
            System.out.println("A pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }
    
    
    public Object pop() { // desempilha os elementos
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
    
    public void exibirPilha() { // exibe os elementos da pilha por completo
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");// se a pilha estiver vazia
            return;
        }
        System.out.println("Estes são os elementos da pilha:");// mostra os elementos que estão dentro da pilha
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }

    public void top(){ // mostra o ultimo elemento aidiconado na pilha
        if (isEmpty()) {
            System.out.println("A pilha está vazia");
            return;
        }
        System.out.println(pilha[numElem - 1]);
    }

    public void inverterPilha() {// inverte os elemntos que estão na pilha
        Object[] temp = new Object[numElem];
        for (int i = 0; i < numElem; i++) {
            temp[i] = pilha[numElem - i - 1];
        }
        pilha = temp;
    }
    
}
