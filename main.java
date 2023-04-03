public class Main{
    public static void main(String args[]){
        VetorAluno vet = new VetorAluno();
        Aluno AL1 = new Aluno();
        AL1.setnome("Carlos Almeida");
        vet.adicionar(AL1);
        if(vet.contem(AL1)){
            
        }
        Nota N1 = new Nota();
        N1.setnota(9.4);
        vet.adicionarN(N1);

        Idade I1 = new Idade();
        I1.setidade(20);
        vet.adicionarI(I1);
    }
}