package com.porta.portafolio.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String url;
    @NotBlank
    private String desempenio;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String url, String desempenio) {
        this.nombre = nombre;
        this.url = url;
        this.desempenio = desempenio;
    }
    
}
