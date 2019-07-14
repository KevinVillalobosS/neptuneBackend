package jupiter.jupiter.repository;

import jupiter.jupiter.models.Archivo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioArchivo extends MongoRepository<Archivo, Serializable> {
    public Archivo findByIdArchivo(String idArchivo);

}