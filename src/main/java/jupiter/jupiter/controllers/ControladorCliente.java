package jupiter.jupiter.controllers;

import jupiter.jupiter.models.Cliente;
import jupiter.jupiter.models.Propuesta;
import jupiter.jupiter.repository.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ControladorCliente {

    @Autowired
    private RepositorioCliente repoClientes;


    public ControladorCliente(){}


    @GetMapping("/clientes")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public List<Cliente> getAll(){
        List<Cliente> clientes;
        clientes = this.repoClientes.findAll();
        return clientes;
    }

    @PostMapping(value = "/nuevoCliente")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public boolean nuevoCliente(@RequestBody Cliente cliente){
        long p = this.repoClientes.count();
        cliente.setIdCliente(Long.toString(p+1));
        this.repoClientes.save(cliente);
        return true;
    }

    @PostMapping(value = "/editarCliente")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    public boolean editarCliente(@RequestBody Cliente cliente){
        this.repoClientes.save(cliente);
        return true;
    }


}
