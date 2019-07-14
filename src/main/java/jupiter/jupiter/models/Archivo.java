package jupiter.jupiter.models;

public class Archivo {
    private String idArchivo;
    private byte[] archivo;


    public Archivo(String idArchivo, byte[] archivo) {
        this.idArchivo = idArchivo;
        this.archivo = archivo;
    }

    public Archivo() {}

    public String getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(String idArchivo) {
        this.idArchivo = idArchivo;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }
}
