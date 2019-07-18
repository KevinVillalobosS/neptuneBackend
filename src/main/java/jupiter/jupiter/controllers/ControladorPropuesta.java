package jupiter.jupiter.controllers;

import jupiter.jupiter.models.Cliente;
import jupiter.jupiter.models.Propuesta;
import jupiter.jupiter.repository.RepositorioPropuestas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Blob;
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

    @GetMapping("/propuestas")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public List<Propuesta> getAll(){
        List<Propuesta> propuestas;
        propuestas = this.repoPropuestas.findAll();
        return propuestas;
    }

    @PostMapping(value = "/nuevaPropuesta")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public boolean nuevaPropuesta(@RequestBody Propuesta propuesta){
        long p = this.repoPropuestas.count();
        propuesta.setIdPropuesta(Long.toString(p+1));
        this.repoPropuestas.save(propuesta);
        return true;
    }

    @PostMapping("/propuestasCliente")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public List<Propuesta> propuestasAsociadas(@RequestBody Cliente cliente){
        List<Propuesta> propuestasCliente;
        propuestasCliente = this.repoPropuestas.findPropuestasByIdCliente(cliente.getIdCliente());
        return propuestasCliente;
    }





}
