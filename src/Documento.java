public class Documento {
    Integer registro;
    String url;
    String titulo;
    Tema tema;
    Index index;

    public Documento(Integer registro, String url, String titulo, Tema tema, Index index) {
        this.registro = registro;
        this.url = url;
        this.titulo = titulo;
        this.tema = tema;
        this.index = index;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }
}
