
public class Elevador {
	public int Andar_atual;
	public int quant_Andares;

	public Elevador(int N) {
		Andar_atual = 1;
		quant_Andares = N;
	}

	public int[] irPara(int andarDestino) {
		if (andarDestino > Andar_atual) {
			return subir(andarDestino);
		}
		else {
			return descer(andarDestino);
		}
		

	}
	private int[] subir(int andarDestino) {
		int[] andares;
		andares = new int[quant_Andares];
		while (Andar_atual < andarDestino){
			int i=0;
			andares[i] = (Andar_atual);

			Andar_atual += 1;

		}	
		return andares;
	}




	private int[] descer(int andarDestino) {
		int[] andares;
		andares = new int[quant_Andares];
		while (Andar_atual > andarDestino) {
			int i = 0;
			andares[i] = (Andar_atual);
			Andar_atual -=1;

		}
		return andares;
}
}
