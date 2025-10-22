public class UsuarioPremium extends Usuario {
    private int nivel;
    private String insignia;
    private String filtro;

    public UsuarioPremium(String nombre, String email, int nivel, String insignia, String filtro) {
        super(nombre, email);
        this.nivel = nivel;
        this.insignia = insignia;
        this.filtro = filtro;
    }

    public void usarFiltros() {
        System.out.println(getNombre() + " está usando el filtro: " + filtro);
    }

    @Override
    public void publicar(String texto) {
        System.out.println(getNombre() + " (Premium) publicó con filtro " + filtro + ": " + texto);
    }
}
