package jupiter.jupiter.repository;

import jupiter.jupiter.models.Propuesta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioPropuestas  extends MongoRepository<Propuesta, Serializable> {
    public Propuesta findByIdPropuesta(String idPropuesta);


}


