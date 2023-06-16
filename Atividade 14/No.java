package Atividade 14;

public class No {
    private Object info;
    private No proximo;
    private No anterior;

    public No(Object info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
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

    @Override
    public String toString() {
        return "No [info=" + info + ", proximo=" + proximo + ", anterior=" + anterior + "]";
    }


}
