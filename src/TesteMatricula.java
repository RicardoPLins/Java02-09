
public class TesteMatricula {

	public static void main(String[] args) {
		Matricula matricula = new Matricula("20211370017");
		String ano = matricula.getAno();
		String periodo = matricula.getPeriodo();
		String codigocurso = matricula.getCodigoCurso();
		String sequencia = matricula.getSequencia();
		System.out.println(ano);   //2021
		System.out.println(periodo); //1
		System.out.println(codigocurso); //37
		System.out.println(sequencia); //0017
	}
	

}
