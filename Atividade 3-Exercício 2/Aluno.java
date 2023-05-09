public class Aluno{
    private String nome;
    private double nota;
    private int idade;

    public Aluno(String nome, double nota, int idade){
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public double getnota(){
        return nota;
    }

    public void setnota(double nota) {
        this.nota = nota;

    }

    public int getidade(){
        return idade;
    }

    public void setidade(int idade){
        this.idade = idade;
    }


}
