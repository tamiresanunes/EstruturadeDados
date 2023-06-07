package Trabalho2.Palindromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a palavra que deseja verificar:");
        String palavra = scanner.next();

        int qndLetras = palavra.length();
        PilhaV pilha = new PilhaV(qndLetras, palavra);

        for (int i = 0; i < qndLetras; i++) {
            char letra = palavra.charAt(i);
            //System.out.println("Letra " + (i+1) + ": " + letra);
            pilha.push(letra);
        }

        //p.exibirPilha();
        pilha.comparar();
    }
}
