public class VetorNotasOtimizado implements IVetorAluno extends Aluno {
	private double notas[] = new double[6];
	private int totalNotas = 0;
	
	@Override
	public void adiciona(double nota) {
		this.notas[totalNotas] = nota;
		totalNotas++;
	}
	@Override
	public boolean contem(double nota) {
		for(int i=0; i < this.totalNotas; i++) {
			if(this.notas[i] == nota) {
				return true;
			}
		}
		return false;
	}
	/*
	@Override
	public boolean busca(double nota){
		for (int i=0; i<tamanho ;i++){
			if (notas[i].equals(nota)){
				return true;
				return i;
			}
		}
		return false;
		return -1;
	}*/

	@Override
    public boolean remover(double notas[], double nota) {
        int indice = -1;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == nota) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            return false;
        } else {
            notas = remover(notas, indice);
            return true;
        }
    }

	@Override
    public void aumentaCapacidade() {
        if (this.tamanho == this.notas.length) {
            notas[] notasNovas = new Aluno[this.notas.length * 2];
            for (int i = 0; i < this.notas.length; i++) {
                alunosNovos[i] = this.notas[i];
            }
            this.notas = notasNovas;
        }
    }
	
	@Override
	public int tamanho() {
		return totalNotas;
	}
	
	
}