package modelo.javabeans;

public class Alumno extends AbstractPersona  {
	private String curso;

	public Alumno() {
		super();
	}
	
	
	
	public Alumno(String nif, String nombre, String direccion, int telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}



	@Override
	public String trabajar() {
		return "El alumno " + this.nombre + " va a estudiar " +  this.curso;
	}

	public String hacerExamen() {
		return this.nombre + " va a hacer su examen";
	}

	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}
