package Stream.ejercicios;

public class Curso {

    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos

    public Curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public int getVideos() {
        return videos;
    }

    public int getAlumnos() {
        return alumnos;
    }
}
