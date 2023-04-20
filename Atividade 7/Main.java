public class Main{
public static void main(String[] args) {
    LDEObject lde = new LDEObject<Aluno>();
    lde.adiciona(new Aluno("Camila Fernades", 21, 10));
    lde.adiciona(new Aluno("Vicente Garcia", 25, 9));
    lde.adiciona(new Aluno("Aurora Ortiz",18, 6));

    System.out.println("Imprimir começo:");
    lde.imprimirComeco();

    System.out.println("Imprimir final");
    lde.imprimirFinal();
    
}
}
