public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador (20);
		System.out.println(elevador.getAndar_atual());
		int[] andares;
		andares = elevador.irPara(22);
		for (int i=0; i<andares.length; i++)
		System.out.println("=>" + andares[i]);
		System.out.println(elevador.getAndar_atual());
		andares = elevador.irPara(18);
		for (int i=0; i<andares.length; i++)
			System.out.println("=>" + andares[i]);
		System.out.println(elevador.getAndar_atual());
		andares = elevador.irPara(5);
		for (int i=0; i<andares.length; i++)
			System.out.println("=>" + andares[i]);
		System.out.println(elevador.getAndar_atual());
	}
}
