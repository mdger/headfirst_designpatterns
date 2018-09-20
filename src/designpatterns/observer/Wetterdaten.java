package designpatterns.observer;

/**
 * Wetterdaten
 */

public class Wetterdaten 
{
    /** @var float */
    private float temperatur;    
    
    /** @var float */
    private float feuchtigkeit;    
    
    /** @var float */
    private float  luftdruck;
    
    /**
     * @param feuchtigkeit the feuchtigkeit to set
     */
    public void setFeuchtigkeit(float feuchtigkeit) {
        this.feuchtigkeit = feuchtigkeit;
    }

    /**
     * @param luftdruck the luftdruck to set
     */
    public void setLuftdruck(float luftdruck) {
        this.luftdruck = luftdruck;
    }

    /**
     * @param temperatur the temperatur to set
     */
    public void setTemperatur(float temperatur) {
        this.temperatur = temperatur;
    }

    /**
     * @return the feuchtigkeit
     */
    public float getFeuchtigkeit() {
        return feuchtigkeit;
    }

    /**
     * @return the luftdruck
     */
    public float getLuftdruck() {
        return luftdruck;
    }

    /**
     * @return the temperatur
     */
    public float getTemperatur() {
        return temperatur;
    }
}