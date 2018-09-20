package designpatterns.observer;

import java.util.HashMap;

/**
 * ObserverAktuelleBedingungen
 */
public class ObserverAktuelleBedingungen 
    implements Observer
{
    private Wetterdaten wetterdaten;
    
    /**
     * @param arg 
     */
    @Override
    public void update(HashMap<String, Object> arg) {
        wetterdaten = (Wetterdaten) arg.get(SubjectTypes.TYPE_WETTERDATEN);
    }
    
    public String aktuelleBedingungen() {
        return wetterdaten.toString();
    }
}