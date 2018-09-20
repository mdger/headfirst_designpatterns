package designpatterns.decorator.getraenke;

/**
 * ZutatenZucker
 */
public class ZutatenZucker 
    extends Zutaten
{
    public ZutatenZucker(Getraenk getraenk) {
        super(getraenk);
    }
    
    @Override
    public float preis() {
        return 0.05f + getGetraenk().preis();
    }
}