
public class Main {
    public static void main(String[] args) {

        MapaLSE mapa = new MapaLSE();

        Aluno a1 = new Aluno(1, "Mateus", 9.0, 21);
        Aluno a2 = new Aluno(2, "Joana", 5.1, 26);
        Aluno a3 = new Aluno(3, "Mariana", 10.0, 30);

        mapa.put(a1.getMatricula(), a1);
        mapa.put(a2.getMatricula(), a2);
        mapa.put(a3.getMatricula(), a3);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(3));

        mapa.put(1, new Aluno(1, "Camila", 4.8, 22));
        System.out.println(mapa.get(1));

    }
    
}
