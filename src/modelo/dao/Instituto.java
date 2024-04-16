package modelo.dao;

import java.util.List;
import java.util.ArrayList;
import modelo.javabeans.AbstractPersona;

import modelo.javabeans.Profesor;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;


public class Instituto implements InstitutoDao {
	
	private List <AbstractPersona> listaPersonas;

	public Instituto() {
		super();
		listaPersonas = new ArrayList<AbstractPersona>();
		cargarDatos();
	}
	
	//Simulamos un método para cargar datos, esto solo tiene utilidad de cara al testing.
	private void cargarDatos() {
		listaPersonas.add(alumno1);
		listaPersonas.add(alumno2);
		listaPersonas.add(alumno3);
		listaPersonas.add(alumno4);
		listaPersonas.add(alumno5);
		listaPersonas.add(profesor1);
		listaPersonas.add(profesor2);
		listaPersonas.add(administrativo1);
		listaPersonas.add(administrativo2);
	}
	

	//Método para añadir solo a aquellas personas que no estén en el sistema.
	@Override
	public boolean altaPersona(AbstractPersona persona) {
		if (!listaPersonas.contains(persona)) {
			listaPersonas.add(persona);
			System.out.println("Añadido correctamente al sistema " + persona.getNombre());
			return true;
		} else {
		System.err.println("ERROR: Persona ya existente en el sistema.");
		return false;
		}
	}

	
	/*
	 * Creamos un bucle para buscar por NIF. En el momento en el que encuentre el mismo NIF,
	 * devolverá a esa persona. Si no encuentra nada, devolverá un null.
	 */
	@Override
	public AbstractPersona buscarPersona(String nif) {
		
		for (AbstractPersona persona: listaPersonas) {
			if (persona.getNif().equalsIgnoreCase(nif)) {
				System.out.println("Persona encontrada: \n" + persona);
				return persona;
			}
		}
		System.err.println("No hay ninguna persona con ese NIF en el sistema");
		return null;
	}
			

	//Devuelve la lista completa
	@Override
	public List<AbstractPersona> buscarTodas() {
		return listaPersonas;
	}

	/*
	 * Aplicamos dos cambios con respecto al método de añadir:
	 * 		1. Puesto que remove y add devuelven True si el elemento está en la lista, 
	 * 			haremos que retorne directamente este valor (no es necesario u nreturn true)
	 * 		2. Puesto que al retornar el if se acaba ahí el método, podemos prescindir del else.
	 * Igualmente ,incluimos 2 sysos para dar más información sobre lo que ha sucedido al ejecutar
	 * el método.
	 * */
	@Override
	public boolean eliminarPersona(AbstractPersona persona) {
		if (listaPersonas.contains(persona)) {
			System.out.println(persona.getNombre() + " ha sido eliminada con éxito del sistema.");
			return listaPersonas.remove(persona);
		}
		System.err.println("La persona que intentas borrar no está registrada en el sistema");
		return false;
	}

	/*
	 * Este método no se me ha ocurrido otra forma de manejarlo, así que en primer lugar
	 * se verifica que el String del parámetro es una clase válida. Si es así, 
	 * se aplica el instance of y se añade a la lista. Esto mismo podría haberse resuelto 
	 * con un switch. 
	 */
	@Override
	public List<AbstractPersona> buscarPersonasPorTipo(String tipoPersona) {
		List <AbstractPersona> auxList = new ArrayList<>();
		
		for (AbstractPersona persona:listaPersonas) {
			if (tipoPersona == "Alumno") {
				if (persona instanceof Alumno) {
					auxList.add(persona);
					System.out.println(((Alumno)persona).hacerExamen());
				}
			}else if (tipoPersona == "Profesor") {
				if (persona instanceof Profesor) {
					auxList.add(persona);
					System.out.println(((Profesor)persona).ponerNotas());
				}
					
			}else if (tipoPersona == "Administrativo") {
				if (persona instanceof Administrativo) {
					auxList.add(persona);
					System.out.println(((Administrativo)persona).trabajar());
				}
					
			}else {
				System.err.println("El tipo de persona no está reconocido en el sistema");
				return null;
			}
		}
		return auxList;
	}
	
	
	//Instanciamos todo lo que se va a cargar en la lista, simulando los datos de una base de datos
	private AbstractPersona alumno1 = new Alumno("AL001", "Amanda", "C/ Estudiantes 1", 600500, "1ºA");
	private AbstractPersona alumno2 = new Alumno("AL002", "Bryan", "C/ Estudiantes 2", 600501, "2ºB");
	private AbstractPersona alumno3 = new Alumno("AL003", "Caty", "C/ Estudiantes 3", 600502, "3ºC");
	private AbstractPersona alumno4 = new Alumno("AL004", "Damián", "C/ Estudiantes 4", 600503, "4ºD");
	private AbstractPersona alumno5 = new Alumno("AL005", "Erwin", "C/ Estudiantes 5", 600504, "5ºE");
	
	private AbstractPersona profesor1 = new Profesor("PF001", "Don Antonio", "Avda. Docente 1", 600401, "Matemáticas");
	private AbstractPersona profesor2 = new Profesor("PF002", "Don Manuel", "Avda. Docente 2", 600402, "Lengua");
	
	private AbstractPersona administrativo1 = new Administrativo("AD001", "Sra. Asun", "Pza Burocracia 1", 600601, "Tomar café");
	private AbstractPersona administrativo2 = new Administrativo("AD002", "Sra. Loli", "Pza Burocracia 2", 600602, "Echarse un cigarro");

}
