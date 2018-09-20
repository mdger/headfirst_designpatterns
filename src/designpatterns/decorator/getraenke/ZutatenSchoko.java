package designpatterns.decorator.getraenke;

/**
 * ZutatenSchoko
 */
public class ZutatenSchoko 
    extends Zutaten
{
    public ZutatenSchoko(Getraenk getraenk) {
        super(getraenk);
    }
    
    @Override
    public float preis() {
        return 0.07f + getGetraenk().preis();
    }    
}