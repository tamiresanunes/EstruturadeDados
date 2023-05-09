public class VetorAluno implements IVetorAluno {

    private Aluno alunos[];
    private int totalAluno[tamanho]
    
    
    public VetorAluno(int tamanho){
        alunos = new Aluno[tamanho];
    }

    @Override
    public void adicionar(Aluno AL){
        if(totalAluno == alunos.length){
            return;
        }
        alunos[totalAluno] = AL;
        totalAluno++;
    }

    @Override
    public boolean contem(Aluno AL){
        for(int i=0, i< alunos.length; i++);{
        if(AL.getNome().equals(alunos[i].getNome())){
            return true;
        }
        }
        return false;
    }
    /*
    @Override
    public boolean remove(int posicao){

		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=posicao; i<tamanho-1; i++){
			alunos[i] = alunos[i+1];
		}
		tamanho--;
	}*/

    @Override
    public boolean remover(Aluno alunos[], String aluno) {
        int indice = -1;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == aluno) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            // Aluno não encontrado no vetor
            return false;
        } else {
            alunos = remover(alunos, indice);
            return true;
        }
    }/*

    @Override
    public boolean busca(Aluno AL){
		for (int i=0; i<totalAluno ;i++){
			if (alunos[i].equals(alunos)){
				return true;
				return i;
			}
		}
		return false;
		return -1;
	}*/

    @Override
    public void aumentaCapacidade() {
        if (this.tamanho == this.alunos.length) {
            Aluno[] alunosNovos = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                alunosNovos[i] = this.alunos[i];
            }
            this.alunos = alunosNovos;
        }
    }
    

    @Override
    public int tamanho(){
        return totalAluno;
    }
}
    