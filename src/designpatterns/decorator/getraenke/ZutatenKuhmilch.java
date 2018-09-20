package designpatterns.decorator.getraenke;

/**
 * ZutatenKuhmilch
 */
public class ZutatenKuhmilch 
    extends Zutaten
{
    public ZutatenKuhmilch(Getraenk getraenk) {
        super(getraenk);
    }
    
    @Override
    public float preis() {
        return 0.3f + getGetraenk().preis();
    }
}