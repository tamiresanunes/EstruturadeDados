public class VetorObject {
    private Object[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento){
		elementos[tamanho] = elemento;
		tamanho++;
	/*public void adiciona(String elemento) throws Exception{
		if (tamanho < elementos.length){
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
		}
	}*/
    }

    public void remove(int posicao){

		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=posicao; i<tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}
    /*
    public Object removerDado(Object elemento) {
        int indice = -1;
        for (int i = 0; i < tamanho.length; i++) {
            if (elemento[i] == dado) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            // Dado não encontrado no vetor
            return elemento;
        } else {
            return removerElemento(elemento);
        }
    }*/


    public Object busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[posicao];
	}

	public boolean busca(Object elemento){
		for (int i=0; i<tamanho ;i++){
			if (elementos[i].equals(elemento)){
				return true;
				return i;
			}
		}
		return false;
		return -1;
	}

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }
}