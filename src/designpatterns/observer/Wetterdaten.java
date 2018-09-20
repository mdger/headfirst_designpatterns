package designpatterns.observer;

/**
 * Wetterdaten
 */

public class Wetterdaten 
{
    private float temperatur;    
    private float feuchtigkeit;    
    private float luftdruck;

    /**
     * @param temperatur
     * @param feuchtigkeit
     * @param luftdruck 
     */
    public Wetterdaten(float temperatur, float feuchtigkeit, float luftdruck) {
        this.temperatur = temperatur;
        this.feuchtigkeit = feuchtigkeit;
        this.luftdruck = luftdruck;
    }

    @Override
    public String toString() {
        return "Aktuelle Temperatur: " + temperatur 
            + " Aktuelle Luftfeuchtigkeit: " + feuchtigkeit 
            + " Aktueller Luftdruck: " + luftdruck;
    }

    public float getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public float getLuftdruck() {
        return luftdruck;
    }

    public float getTemperatur() {
        return temperatur;
    }
}