public class Usuario {
    private String nombre;
    private String email;
    private java.util.List<Usuario> amigos;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.amigos = new java.util.ArrayList<>();
    }

    public void publicar(String texto) {
        System.out.println(nombre + " publicó: " + texto);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public java.util.List<Usuario> getAmigos() {
        return amigos;
    }

    public void addAmigo(Usuario amigo) {
        amigos.add(amigo);
        System.out.println(nombre + " agregó a " + amigo.getNombre() + " como amigo.");
    }
}
