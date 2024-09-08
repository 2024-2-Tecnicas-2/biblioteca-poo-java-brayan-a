import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacionTest {
    
    @Test
    public void testSetTitulo() {
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo("Brayan");
        assertEquals("Brayan", publicacion.getTitulo());
    }

    @Test
    public void testSetAnoPublicacion() {
        Publicacion publicacion = new Publicacion();
        publicacion.setAnoPublicacion(2020);
        assertEquals(2020, publicacion.getAnoPublicacion());
    }
    
    
}
