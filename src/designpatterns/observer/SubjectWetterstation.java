package designpatterns.observer;

/**
 * SubjectWetterstation
 */

public class SubjectWetterstation 
    extends Subject
{
    private Wetterdaten wetterdaten;

    /**
     * 
     * @param wetterdaten
     * 
     */
    
    public SubjectWetterstation(Wetterdaten wetterdaten) {
        this.wetterdaten = wetterdaten;
    }    

    /**
     * @param wetterdaten the wetterdaten to set
     */

    public void setWetterdaten(Wetterdaten wetterdaten) {
        this.wetterdaten = wetterdaten;
    }
}