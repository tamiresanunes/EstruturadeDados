public class Ponto{

    private int Xa;
    private int Xb;
    private int Ya;
    private int Yb;

    //Construtores

    public Ponto(int Xa, int Xb, int Ya, int Yb) {
        this.Xa = Xa;
        this.Xb = Xb;
        this.Ya = Ya;
        this.Yb = Yb;
    }

    public Ponto(){
        this.Xa = 0;
        this.Xb = 0;
        this.Ya = 0;
        this.Yb = 0;
    }

    //Getters e Setters

    public int getXa() {
        return Xa;
    }

    public void setXa(int Xa) {
        this.Xa = Xa;
    }

    public int getXb() {
        return Xb;
    }

    public void setXb(int Xb) {
        this.Xb = Xb;
    }

    public int getYa() {
        return Ya;
    }

    public void setYa(int Ya) {
        this.Ya = Ya;
    }

    public int getYb(){
        return Yb;
    }

    public void setYb(int Yb){
        this.Yb = Yb;
    }

    //método que calcula a distância

    public int distanciaAB(int Xa, int Xb, int Ya, int Yb){
        int distanciaAB = Math.abs((this.Xa - this.Xb) * 2) + Math.abs((this.Ya - this.Yb) * 2)/2;
        return distanciaAB;

    }
}
