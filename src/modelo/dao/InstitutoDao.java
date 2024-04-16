package modelo.dao;
import modelo.javabeans.AbstractPersona;
import java.util.List;

public interface InstitutoDao {

	boolean altaPersona(AbstractPersona persona);
	AbstractPersona buscarPersona(String nif);
	List<AbstractPersona> buscarTodas();
	boolean eliminarPersona(AbstractPersona persona);
	List<AbstractPersona> buscarPersonasPorTipo(String tipoPersona);
	
	
}
