import java.util.List;

public class Tema {
    List<Registro>registros;
    String temas;
    String subTemas;

    public Tema(String temas, String subTemas) {
        this.temas = temas;
        this.subTemas = subTemas;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public String getSubTemas() {
        return subTemas;
    }

    public void setSubTemas(String subTemas) {
        this.subTemas = subTemas;
    }
}
