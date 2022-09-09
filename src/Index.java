import java.util.Date;

public class Index {
boolean hash;
int tamaño;
Date fecha;
Documento documento;

    public Index(boolean hash, int tamaño, Date fecha, Documento documento) {
        this.hash = hash;
        this.tamaño = tamaño;
        this.fecha = fecha;
        this.documento = documento;
    }

    public boolean isHash() {
        return hash;
    }

    public void setHash(boolean hash) {
        this.hash = hash;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
