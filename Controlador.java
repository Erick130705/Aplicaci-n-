public class Controlador {
    private java.util.List<Reaccion> reacciones;
    private java.util.List<Comentario> comentarios;
    private java.util.List<Post> posts;

    public Controlador() {
        reacciones = new java.util.ArrayList<>();
        comentarios = new java.util.ArrayList<>();
        posts = new java.util.ArrayList<>();
    }

    public void agregarReaccion(Reaccion reaccion) {
        reacciones.add(reaccion);
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public java.util.List<Reaccion> verReacciones() {
        return reacciones;
    }

    public java.util.List<Comentario> verComentarios() {
        return comentarios;
    }

    public java.util.List<Post> verInicio() {
        return posts;
    }
}
