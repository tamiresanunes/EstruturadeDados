public class No{
    int valor;
    No proximo;
    No anterior;
    

    public No (int valor){
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
        this.tamanho = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    int tamanho;


    @Override
    public String toString() {
        return "No [valor=" + valor + ", proximo=" + proximo + ", anterior=" + anterior + ", tamanho=" + tamanho + "]";
    }

    


    
}
