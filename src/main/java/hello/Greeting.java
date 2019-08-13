package hello;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

    private final long id;
    private final String content;
    private final String tipo;

    public Greeting(long id, String content, String tipo) {
        this.id = id;
        this.content = content;
        this.tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTipo() {
        return tipo;
    }
}