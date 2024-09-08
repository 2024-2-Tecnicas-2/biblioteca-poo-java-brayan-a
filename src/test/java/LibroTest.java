
import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
   
    @Test
    public void testSetTitulo() {
        Libro libro = new Libro("Marcelo", 255, "Mar", 2000);
        assertEquals("Marcelo", libro.getAutor());
        assertEquals(2000, libro.getAnoPublicacion());
        assertEquals(255, libro.getNumero_de_paginas());
    }

    @Test
    public void testGetters() {
        // Crear un libro con valores específicos
        Libro libro = new Libro("El maravillo mundo de los sueños", 500, "Marco", 2003);

        // Comprobar que los métodos get devuelven los valores correctos
        assertEquals("Marco", libro.getTitulo());  // Usar el getter heredado
        assertEquals(500, libro.getNumero_de_paginas());
        assertEquals("El maravillo mundo de los sueños", libro.getAutor());
        assertEquals(2003, libro.getAnoPublicacion());  // Usar el getter heredado
    }

}
