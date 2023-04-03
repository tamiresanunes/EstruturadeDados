public class VetorAluno{

    private Aluno alunos[];
    private int totalAluno[tamanho]
    private double nota[];
    private int totalNotas[tamanho]
    private int idade[];
    private int totalIdade[tamanho]

    public VetorAluno(int tamanho){
        alunos = new Aluno[tamanho];
    }

    public void adicionar(Aluno AL){
        if(totalAluno == alunos.length){
            return;
        }
        alunos[totalAluno] = AL;
        totalAluno++;
    }

    public void adicionarN(Nota N1){
        if(totalNotas == nota.length){
            return;
        }
        nota[totalNotas] = N1;
        totalNotas++;
    }

    public void adicionarI(Idade I1){
        if(totalIdade == idade.length){
            return;
        }
        idade[totalIdade] = I1;
        totalIdade++;
    }

    public boolean contem(Aluno AL){
        for(int i=0, i< alunos.length; i++);{
        if(AL.getNome().equals(alunos[i].getNome())){
            return true;
        }
        }
        return false;
    }

    public boolean contemN(Nota N1){
        for(int i=0, i< nota.length; i++);{
        if(N1.getnota().equals(nota[i].getnota())){
            return true;
        }
        }
        return false;
    }

    public boolean contemI(Idade I1){
        for(int i=0, i< idade.length; i++);{
        if(I1.getidade().equals(idade[i].getidade())){
            return true;
        }
        }
        return false;
    }

    public int tamanho(){
        return totalAluno;
    }
}