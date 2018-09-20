package designpatterns.decorator.getraenke;

/**
 * Getraenk
 */
public abstract class Getraenk 
{
    private String name;

    public abstract float preis();

    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    protected String getName() {
        return name;
    }
}