package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Serie {
    private String nombre;
    private String temporadas;
    private String descripcion;
    private String genero;
    private String imagen; 
    private String trailer;

    @JsonCreator
    public Serie(@JsonProperty("nombre") String nombre,
                 @JsonProperty("temporadas") String temporadas,
                 @JsonProperty("descripcion") String descripcion,
                 @JsonProperty("genero") String genero,
                 @JsonProperty("imagen") String imagen,
                 @JsonProperty("trailer") String trailer) {
    				 
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.descripcion = descripcion;
        this.genero = genero;
        this.imagen = imagen;
        this.trailer = trailer;
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

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
    public String getTrailer() {
        return trailer;
    }
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
