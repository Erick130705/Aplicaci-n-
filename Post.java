public class Post {
    private String texto;
    private String hora;
    private Usuario autor;

    public Post(String texto, String hora, Usuario autor) {
        this.texto = texto;
        this.hora = hora;
        this.autor = autor;
    }

    public void mostrar() {
        System.out.println("[" + hora + "] " + autor.getNombre() + ": " + texto);
    }

    public Usuario getAutor() {
        return autor;
    }
}
