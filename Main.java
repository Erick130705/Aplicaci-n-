import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Interfaz interfaz = new Interfaz(controlador);

        Usuario u1 = new Usuario("Diego", "diego@email.com");
        UsuarioPremium u2 = new UsuarioPremium("Alessandro", "alex@email.com", 
                                                3, "Oro", "Blanco y negro");

        u1.addAmigo(u2);
        u2.publicar("¡Me encanta esta app!");
        u2.usarFiltros();

        Post post = new Post("Primer post de prueba", "10:45", u1);
        post.mostrar();
    }
}
