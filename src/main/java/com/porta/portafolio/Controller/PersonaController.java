
package com.porta.portafolio.Controller;

import com.porta.portafolio.Entity.Persona;
import com.porta.portafolio.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "https://portafolio-c03a3.web.app")

public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;
    
    @GetMapping("/traer")
    public List<Persona>getPersona(){
     return ipersonaService.getPersona();   
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deletePersona (@PathVariable Integer id){
        ipersonaService.deletePersona(id);
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Persona editPersona(@PathVariable("id") Integer id,
                              @RequestBody Persona persona)
    {
        
        persona.setId(id);
    
    ipersonaService.savePersona(persona);
    return persona;
    }
    
    @GetMapping(path = {"/{id}"})
    public Persona findPersona(@PathVariable("id")int id){
        return ipersonaService.findPersona(id);
    }
    
    
    
}