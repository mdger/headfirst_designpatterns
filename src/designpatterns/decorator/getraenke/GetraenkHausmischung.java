package designpatterns.decorator.getraenke;

/**
 * GetraenkHausmischung
 */
public class GetraenkHausmischung 
    extends Getraenk
{
    public GetraenkHausmischung() {
        setName("Hausmischung");
    }

    @Override
    public float preis() {
        return 1.2f;
    }
}