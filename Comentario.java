public class Comentario {
    private String comentario;
    private Usuario autor;
    private String fecha;

    public Comentario(String comentario, Usuario autor, String fecha) {
        this.comentario = comentario;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }
}
