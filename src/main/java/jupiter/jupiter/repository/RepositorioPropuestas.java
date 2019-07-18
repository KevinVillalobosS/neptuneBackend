package jupiter.jupiter.repository;

import jupiter.jupiter.models.Propuesta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface RepositorioPropuestas  extends MongoRepository<Propuesta, Serializable> {
    public List<Propuesta> findPropuestasByIdCliente(String idCliente);

}


