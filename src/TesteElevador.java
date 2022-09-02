
public class TesteElevador {

	public static void main(String[] args) {
		Elevador e1 = new Elevador(10);
		e1.irPara( 5);
		System.out.println(e1.Andar_atual);
		System.out.println(e1.quant_Andares);
		e1.irPara(3);
		System.out.println(e1.Andar_atual);
		
		Elevador elevador = new Elevador (10);
		System.out.println(elevador.Andar_atual);
		int[] andares;
		andares = elevador.irPara(5);
		for (int i=0; i<andares.length; i++) {
			System.out.println("=>"+ andares[i]);}
		
	}
}
