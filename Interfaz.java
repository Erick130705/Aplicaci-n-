public class Interfaz {
    private Controlador controlador;
    private Usuario usuarioActual;

    public Interfaz(Controlador controlador) {
        this.controlador = controlador;
    }

    public void registrarUsuario() {
        System.out.println("Registrando nuevo usuario...");
    }

    public void iniciarSesion() {
        System.out.println("Iniciando sesión...");
    }

    public void publicarTexto() {
        System.out.println("Publicando texto...");
    }

    public void reaccionarPost() {
        System.out.println("Reaccionando a un post...");
    }

    public void verInicio() {
        System.out.println("Mostrando publicaciones...");
    }
}
