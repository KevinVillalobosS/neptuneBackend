package jupiter.jupiter.models;


import lombok.Data;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;

@Document(collection = "Propuestas")
public class Propuesta implements Serializable {
    @Id
    @NotNull
    @AutoConfigureOrder
    private String idPropuesta;
    private String nombrePropuesta;
    private String cliente;
    private String idCliente;
    private String fecha;
    //private String[] tags;
    private String estado;

    public Propuesta(@NotNull String idPropuesta, String nombrePropuesta, String cliente, String idCliente, String fecha, String estado) {
        this.idPropuesta = idPropuesta;
        this.nombrePropuesta = nombrePropuesta;
        this.cliente = cliente;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Propuesta(){}

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(String idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /*public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
*/
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
