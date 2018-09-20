package designpatterns.decorator.getraenke;

/**
 * Zutaten
 */
public abstract class Zutaten 
    extends Getraenk
{
    private Getraenk getraenk;

    /**
     * @param getraenk
     */
    public Zutaten(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    /**
     * @return the getraenk
     */
    protected Getraenk getGetraenk() {
        return this.getraenk;
    }
}