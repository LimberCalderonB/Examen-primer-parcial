import java.util.List;

public class Registro {
    Integer registro;
    List<Documento>documentos;

    public Registro(Integer registro) {
        this.registro = registro;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }
}
