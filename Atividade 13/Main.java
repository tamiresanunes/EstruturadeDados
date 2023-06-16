package Atividade 13;
public class Main {
    public static void main(String[] args) {
        MapaVet mapa = new MapaVet();

        // Criando alguns alunos
        Aluno aluno1 = new Aluno("Camila",26 , "979");
        Aluno aluno2 = new Aluno("Mateus", 20, "963");
        Aluno aluno3 = new Aluno("Mariana", 18, "147");

        // Inserindo alunos no mapa
        mapa.put(aluno1);
        mapa.put(aluno2);
        mapa.put(aluno3);

        // Obtendo um aluno pelo número de matrícula
        Aluno alunoEncontrado = mapa.get("963");
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNome());
        } else {
            System.out.println("O aluno não foi encontrado.");
        }

        mapa.remove("979");

        mapa.imprime();
    }
    
}
