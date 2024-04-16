package modelo.javabeans;

public class Profesor extends AbstractPersona  {
	private String competencias;
	
	

	public Profesor() {
		super();
	}


	public Profesor(String nif, String nombre, String direccion, int telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}


	@Override
	public String trabajar() {
		return "El profesor " + this.nombre + " va a impartir su clase.";
	}

	
	public String ponerNotas() {
		return this.nombre + " va a corregir los exámenes";
	}


	@Override
	public String toString() {
		return "Profesor [competencias=" + competencias + ", nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]\n";
	}

}
