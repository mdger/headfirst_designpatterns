package designpatterns.observer;

/**
 * SubjectWetterstation
 */

public class SubjectWetterstation 
    extends Subject
{
    /**
     * 
     * @param wetterdaten
     * 
     */
    
    public SubjectWetterstation(Wetterdaten wetterdaten) {
        getObserverData().put(SubjectTypes.TYPE_WETTERDATEN, wetterdaten);
    }    

    /**
     * @param wetterdaten the wetterdaten to set
     */

    public void setWetterdaten(Wetterdaten wetterdaten) {
        getObserverData().put(SubjectTypes.TYPE_WETTERDATEN, wetterdaten);
    }
}