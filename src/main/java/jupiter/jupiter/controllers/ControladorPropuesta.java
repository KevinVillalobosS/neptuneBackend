package jupiter.jupiter.controllers;

import jupiter.jupiter.models.Propuesta;
import jupiter.jupiter.repository.RepositorioPropuestas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        List<Propuesta> propuestas = this.repoPropuestas.findAll();
        return propuestas;
    }




}
