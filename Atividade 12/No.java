public class No {
    private Object info;
    private No proximo;

    public No (Object info){
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {
        return this.info;
    }


    public No getproximo() {
        return this.proximo;
    }

    public void setproximo(No n) { 
        this.proximo = n; 
    }

    @Override
    public String toString() {
        return "No [info=" + info + ", proximo=" + proximo + "]";
    }

    

}
