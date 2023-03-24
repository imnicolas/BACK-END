package com.porta.portafolio.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoEducacion {
    @NotBlank
    private String establecimiento;
    @NotBlank
    private String logro;
    @NotBlank
    private String fecha;

    public dtoEducacion() {
    }

    public dtoEducacion(String establecimiento, String logro, String fecha) {
        this.establecimiento = establecimiento;
        this.logro = logro;
        this.fecha = fecha;
    }

}
