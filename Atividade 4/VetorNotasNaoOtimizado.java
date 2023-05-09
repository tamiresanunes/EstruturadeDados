public class VetorNotasNaoOtimizado implements IVetorAluno extends Aluno {

	private double notas[] = new double[6];

	@Override
	public void adiciona(double nota) {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {
				this.notas[i] = nota;
				break;
			}
		}
	}
	@Override
	public boolean contem(int nota) {
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == nota) {
				return true;
			}
		}
		return false;
	}/*
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
		int tamanho = 0;
		for(int i=0; i < this.notas.length; i++) {
			if(this.notas[i] == 0) {

				break;
			}
			tamanho++;
		}
		return tamanho;
	}

}
