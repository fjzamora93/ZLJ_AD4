package testing;

import modelo.javabeans.AbstractPersona;
import modelo.javabeans.Profesor;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;

import java.util.List;
import java.util.ArrayList;

public class testPersona {

	public static void main(String[] args) {
		
		AbstractPersona profesorTest = new Profesor("PF000", "Don Manuel", "Avda. Docente", 400, "Competencias");
		AbstractPersona alumnoTest = new Alumno("AL000", "Alicia", "C/ Estudiantes", 500, "Curso");
		AbstractPersona administrativoTest = new Administrativo("AD000", "Sra. Asun", "Pza Burocracia", 600, "Tomar café y echarse un cigarro");
		
		AbstractPersona director = new Profesor("DR000", "Doña Josefa", "Avda. Docente", 401, "Competencias de direccion");
		
		List <AbstractPersona> lista = new ArrayList<>();
		lista.add(administrativoTest);
		lista.add(alumnoTest);
		lista.add(profesorTest);
		
		for (AbstractPersona persona:lista) {
			//Ejecutamos el método toString con un Syso
			System.out.println(persona);
			
			//Ejecuta el método trabajar
			String accion = persona.trabajar();
			System.out.println(accion);
			
			//Ejecuta el método llamar
			accion = persona.llamar(director);
			System.out.println(accion);
			
			//Ejecuta el método ponerNotas de Profesor
			if (persona instanceof Profesor) {
				accion = ((Profesor)persona).ponerNotas();
				System.out.println(accion + "\n\n");
			}
			
			//Ejecuta el méotod hacerExamen de Alumno
			else if (persona instanceof Alumno){
				accion = ((Alumno)persona).hacerExamen();
				System.out.println(accion + "\n\n");
			}
			//Ejecuta el método gestionarMatricula de Administrativo
			else if (persona instanceof Administrativo) {
				accion = ((Administrativo)persona).gestionarMatricula();
				System.out.println(accion + "\n\n");
			}
			
		}
		
	}

}

/*
 * AbstractAnimal g2 = new Gato("Felix sylvestre", 4, "Sonia", 6);
 * ((Gato)g2).perderVidas(2);
 * 
 * if (! g2 instanceof Gato){
 * 	g2.metodoPropio();
 * 	}
 * */
 