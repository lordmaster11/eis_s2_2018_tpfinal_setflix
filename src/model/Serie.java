package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Serie {
    private String nombre;
    private String temporadas;
    private String estado;
    private String genero;
    private String imagen;

    @JsonCreator
    public Serie(@JsonProperty("nombre") String nombre,
                 @JsonProperty("temporadas") String temporadas,
                 @JsonProperty("estado") String estado,
                 @JsonProperty("genero") String genero,
                 @JsonProperty("imagen") String imagen){
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.estado = estado;
        this.genero = genero;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
         this.nombre = nombre;
    }

    public String getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
