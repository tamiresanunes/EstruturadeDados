
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        MapaVet mapvet = new MapaVet();

        String[] string = {"Anna", "Brena", "Mateus", "Caio"};
        int nome = rand.nextInt(string.length);

        int matricula = String.valueOf(rand.nextInt(10000));
        for(int i = 0; i <= 10000; i++){
            mapvet.put(new Aluno(string[nome], 10, matricula));
        }

        mapvet.imprime();
    }
}
    
