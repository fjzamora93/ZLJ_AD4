package modelo.javabeans;

public class Administrativo extends AbstractPersona {
	private String tareas;
	
	public Administrativo() {
		super();
	}
	
	
	
	public Administrativo(String nif, String nombre, String direccion, int telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}



	@Override
	public String trabajar() {
		return "El Administrativo " + this.nombre + " va a realizar estas tareas: " + this.tareas;
	}

	public String gestionarMatricula() {
		return this.nombre + " va a gestionar una matrícula.";
	}

	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}
