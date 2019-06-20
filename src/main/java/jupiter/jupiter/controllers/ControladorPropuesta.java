package jupiter.jupiter.controllers;

import jupiter.jupiter.models.Propuesta;
import jupiter.jupiter.repository.RepositorioPropuestas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/main")

public class ControladorPropuesta {

    @Autowired
    private RepositorioPropuestas repoPropuestas;

    public ControladorPropuesta() {}

    @RequestMapping(value = "/dashboard")
    public String retornarPropuestas(){
        return "la propuesta";
    }

    @GetMapping("/all")
    public List<Propuesta> getAll(){
        List<Propuesta> propuestas;
        propuestas = this.repoPropuestas.findAll();
        return propuestas;
    }

    @PostMapping(value = "/nuevaPropuesta")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public boolean nuevaPropuesta(@RequestBody Propuesta propuesta){
        //TODO: agregar id al final automaticamente
        propuesta.setIdPropuesta("11");
        this.repoPropuestas.save(propuesta);
        return true;
    }






}
