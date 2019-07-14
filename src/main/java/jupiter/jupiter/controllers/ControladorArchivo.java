package jupiter.jupiter.controllers;


import jupiter.jupiter.models.Archivo;
import jupiter.jupiter.repository.RepositorioArchivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Blob;

@RestController
@RequestMapping(value = "/archivos")
public class ControladorArchivo {


    @Autowired
    private RepositorioArchivo repositorioArchivo;

    @PostMapping("/subir")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
    public String subir(@RequestParam("file") MultipartFile archivo) throws IOException {
        System.out.println(archivo.getName());
        Archivo documento = new Archivo();
        documento.setIdArchivo("1");
        documento.setArchivo(archivo.getBytes());
        this.repositorioArchivo.save(documento);
        return "hecho";
    }

    @GetMapping("/bajar")
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
    public String bajar(String idarchivo){
        Archivo archivo = this.repositorioArchivo.findByIdArchivo(idarchivo);
        //Blob blob = archivo.getArchivo();
        return "hecho";
    }








}
