package modelo.javabeans;

import java.util.Objects;

public abstract class AbstractPersona {
	protected String nif;
	protected String nombre;
	protected String direccion;
	protected int telefono;
	
	
	
	
	public AbstractPersona(String nif, String nombre, String direccion, int telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//MÉTODOS DE LA CLASE ABSTRACTA
	
	public AbstractPersona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String llamar(AbstractPersona persona_llamada) {
		String llamada = this.nombre + " llamando a " + persona_llamada.nombre;
		return llamada;
	}
	
	public abstract String trabajar();
	
	
	//HASHCODE

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPersona other = (AbstractPersona) obj;
		return Objects.equals(nif, other.nif);
	}

	
	//TO STRING
	
	@Override
	public String toString() {
		return "AbstractPersona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "] \n";
	}

	
	//GETTERS Y SETTERS
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}

