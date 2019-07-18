package jupiter.jupiter.repository;

import jupiter.jupiter.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioCliente extends MongoRepository<Cliente, Serializable> {
    public Cliente findClienteByidCliente(String idcliente);

}
