public class Aluno{
    private String nome;
    private  double nota;
    private int idade;


    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getNota() {
        return nota;
    }


    public void setNota(double nota) {
        this.nota = nota;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + ", idade=" + idade + "]";
    }


    public String getMatricula() {
        return null;
    }

    



    

    

    

    
}