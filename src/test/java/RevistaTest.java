
import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RevistaTest {

    @Test
    public void testRevista() {
        // Crear una revista con valores específicos
        Revista revista = new Revista(163, "Estefi", "errote", 2026);

        // Comprobar que los métodos get devuelven los valores correctos
        assertEquals("errote", revista.getTitulo());  // Usar el getter heredado
        assertEquals(2026, revista.getAnoPublicacion());  // Usar el getter heredado
        assertEquals(163, revista.getNumeroRevistas());
        assertEquals("Estefi", revista.getNombreRevista());

        // Comprobar el método toString()
        String expected = "Revista{Titulo=errote, anoPublicacion=2026NumeroRevistas=163, NombreRevista=Estefi}";
        assertEquals(expected, revista.toString());

    }
    
    //esto es una prueba donde le indica que falla si pone el año mal 
    @Test
    public void testInvalido() {
        // Probar con valores inválidos, como un año de publicación futuro
        Revista revistaFutura = new Revista(6, "NombreRevista", "sueños", 2015);
        assertEquals(6, revistaFutura.getNumeroRevistas());
        assertEquals(2015, revistaFutura.getAnoPublicacion(), "El año de publicación debe ser 2015");
    }
}
