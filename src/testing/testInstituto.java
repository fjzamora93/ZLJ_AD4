//TEST RELACIONADOS CON LA LISTA DE IMPLEMENTACIÓN DE INSTITUTO

package testing;

import modelo.javabeans.AbstractPersona;
import modelo.javabeans.Profesor;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.dao.Instituto;
import java.util.List;
import java.util.ArrayList;


public class testInstituto {
	
	public static void main(String[]args) {
	Instituto instituto = new Instituto();
	
	AbstractPersona alumnoExistente = new Alumno("AL001", "Amanda", "C/ Estudiantes 1", 600500, "1ºA");
	AbstractPersona alumnoNuevo = new Alumno("AL009", "Jordi", "C/ Estudiantes 1", 600589, "1ºA");
	
	
	System.out.println("\n --- AÑADIR UNA PERSONA");
	instituto.altaPersona(alumnoNuevo);
	instituto.altaPersona(alumnoExistente);
	

	//BUSCAR POR TIPO
	System.out.println("\n --- BUSCAR ALUMNOS");
	instituto.buscarPersonasPorTipo("Alumno");
	
	System.out.println("\n --- BUSCAR PROFESOR");
	instituto.buscarPersonasPorTipo("Profesor");
	
	System.out.println("\n --- BUSCAR ADMINISTRATIVO");
	instituto.buscarPersonasPorTipo("Administrativo");
	
	
	System.out.println("\n --- ELIMINAR UNA PERSONA");
	instituto.eliminarPersona(alumnoNuevo);
	
	
	System.out.println("\n --- BUSCAR TODOS");
	System.out.println(instituto.buscarTodas());
	
	
	System.out.println("\n --- BUSCAR POR NIF");
	instituto.buscarPersona("AL001");
	instituto.buscarPersona("ZL001");
	
	
	}
	

}
