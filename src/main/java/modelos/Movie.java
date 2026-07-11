package modelos;

public class Movie {
    
    private int id;
    private String nombre;
    private String descripcion;
    private String clasificacion;
    private String reparto;
    private String director;
    private String rutaImagen;
    private String rutaImagenBoton;
    private String trailer;
    private String duracion;
    private boolean estado;
    
    public Movie() {}

    public Movie(String nombre, String descripcion, String clasificacion, String reparto, String director, String rutaImagen, String rutaImagenBoton, String trailer, String duracion, boolean estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.reparto = reparto;
        this.director = director;
        this.rutaImagen = rutaImagen;
        this.rutaImagenBoton = rutaImagenBoton;
        this.trailer = trailer;
        this.duracion = duracion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getReparto() {
        return reparto;
    }

    public String getDirector() {
        return director;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getRutaImagenBoton() {
        return rutaImagenBoton;
    }

    public void setRutaImagenBoton(String rutaImagenBoton) {
        this.rutaImagenBoton = rutaImagenBoton;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
