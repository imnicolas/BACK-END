package com.porta.portafolio.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoExperiencia {
    @NotBlank
    private String nombre;
    @NotBlank
    private String puesto;
    @NotBlank
    private String fecha;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombre, String puesto, String fecha) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.fecha = fecha;
    }
    
    
}
