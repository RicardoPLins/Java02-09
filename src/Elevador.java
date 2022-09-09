public class Elevador {
	private int andar_atual;
	public int quant_Andares;

	public Elevador(int N) {
		andar_atual = 1;
		quant_Andares = N;
	}
	public int getAndar_atual() {
		return andar_atual;
	}


	public int[] irPara(int andarDestino) {
		if (andarDestino > andar_atual) 
			return subir(andarDestino);
		else 
			if(andarDestino < andar_atual)
				return descer(andarDestino);
			else
				return new int[] {};
	}


	private int[] subir(int andarDestino) {
		if(andarDestino > quant_Andares) {
			System.out.println("Andar Destino inválido");
			System.exit(0);}
		
		
		int[] valores = new int [Math.abs(andarDestino - andar_atual)];
		int i=0;
		while (andar_atual < andarDestino){
			andar_atual ++;
			valores[i] = andar_atual;
			i++;
			
		}	
		return valores;
	}




	private int[] descer(int andarDestino) {
		int[] valores = new int[andar_atual - andarDestino];
		int i=0;
		while (andar_atual > andarDestino) {
			andar_atual--;
			valores[i] = andar_atual;
			i++;
			

		}
		return valores;
}
}
