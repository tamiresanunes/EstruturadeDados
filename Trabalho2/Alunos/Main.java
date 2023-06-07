package Trabalho2.Alunos;

public class Main {
    public static void main(String[] args) {
        PilhaV pilha = new PilhaV(5);
        pilha.push("Camila Fernandes");
        pilha.push("Daiane de Oliveira");
        pilha.push("Mateus Nunes");
        pilha.push("Pedro Motta");
        pilha.push("Felipe Martinelli");
        System.out.println("Estes são os elementos na pilha");
        pilha.exibirPilha();
        System.out.println("===============");
        pilha.inverterPilha();
        System.out.println("Estes são os elementos da pilha ao contrário");
        pilha.exibirPilha();
        System.out.println("Elemento do topo da pilha");
        pilha.top();

    }
} 
