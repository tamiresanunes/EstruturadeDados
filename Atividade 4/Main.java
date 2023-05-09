public class Main {

	public static void main(String[] args) {
		/*VetorNotasNaoOtimizado vetNotasNO = new VetorNotasNaoOtimizado();*/
		IVetorAluno vetNotasNO = new VetorNotasNaoOtimizado();
		vetNotasNO.adiciona(6.1);
		vetNotasNO.adiciona(8.4);
		vetNotasNO.contem(4.6);
		vetNotasNO.contem(6.1);
		vetNotas.remove(6.1);
		vetNotasNO.remove(4.9);
		vetNotasNO.aumentaCapacidade(vetNotasNo, 10);

		/*VetorNotasOtimizado vetNotas = new VetorNotasOtimizado();*/
		IVetorAluno vetNotas = new VetorNotasOtimizado();
		vetNotas.adiciona(7.0);
		vetNotas.adiciona(9.5);
		vetNotas.contem(5.4);
		vetNotas.contem(7.0);
		vetNotas.remove(9.5);
		vetNotas.remove(4.7);
		vetNotas.aumentaCapacidade(vetNotas, 10);

		/*VetorAluno vetAluno = new VetorAluno();*/
		IVetorAluno vetAluno = new VetorAluno();
		vetAluno.adiciona("Melissa Sampaio");
		vetAluno.adiciona("Vicente Dotta");
		vetAluno.contem("Pietro Marconi");
		vetAluno.contem("Melissa Sampaio");
		vetAluno.remove("Paula Ortiz");
		vetAluno.remove("Vicente Dotta");
		vetAluno.aumentaCapacidade(vetAluno, 10);

	}
