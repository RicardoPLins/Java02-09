public class Matricula {


	public String matricula; //20211370017
	private String ano;
	private String periodo;
	private String codigoCurso;
	private String sequencia;

	

	public String getAno() {
		return matricula.substring(0,4);
	}

	

	public String getPeriodo() {
		return matricula.substring(4,5);
	}

	

	public String getCodigoCurso() {
		return matricula.substring(5,7);
	}

	

	public String getSequencia() {
		return matricula.substring(7);
	}

	
	public Matricula(String matricula) {
		this.matricula = matricula;
	}
}
	