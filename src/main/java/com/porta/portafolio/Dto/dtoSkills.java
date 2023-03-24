package com.porta.portafolio.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private int progess;
    @NotBlank
    private String img;

    public dtoSkills() {
    }

    public dtoSkills(String nombre, int progess, String img) {
        this.nombre = nombre;
        this.progess = progess;
        this.img = img;
    }

}
