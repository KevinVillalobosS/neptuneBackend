package jupiter.jupiter.models;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Cliente {
    @Id
    @NotNull
    private String idCliente;
    @UniqueElements
    private String nombreCliente;
    //rubro o actividad del cliente
    private String rubroCliente;
    private int evaluacionCliente;
    private String emailCliente;
    //numero de telefono del cliente
    private String fonoCliente;
    //Estados: activo, inactivo, bloqueado.
    private String estadoCliente;


    public Cliente(@NotNull String idCliente, @UniqueElements String nombreCliente,
                   String rubroCliente, int evaluacionCliente, String emailCliente, String fonoCliente, String estadoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.rubroCliente = rubroCliente;
        this.evaluacionCliente = evaluacionCliente;
        this.emailCliente = emailCliente;
        this.fonoCliente = fonoCliente;
        this.estadoCliente = estadoCliente;
    }

    public Cliente(){}

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRubroCliente() {
        return rubroCliente;
    }

    public void setRubroCliente(String rubroCliente) {
        this.rubroCliente = rubroCliente;
    }

    public int getEvaluacionCliente() {
        return evaluacionCliente;
    }

    public void setEvaluacionCliente(int evaluacionCliente) {
        this.evaluacionCliente = evaluacionCliente;
    }

    public String getEmail() {
        return emailCliente;
    }

    public void setEmail(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getFonoCliente() {
        return fonoCliente;
    }

    public void setFonoCliente(String fonoCliente) {
        this.fonoCliente = fonoCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
}


