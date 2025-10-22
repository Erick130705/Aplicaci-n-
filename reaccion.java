public class Reaccion {
    private String tipo;
    private Usuario autor;

    public Reaccion(String tipo, Usuario autor) {
        this.tipo = tipo;
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public Usuario getAutor() {
        return autor;
    }
}
