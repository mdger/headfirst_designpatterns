package designpatterns.observer;

import java.util.HashMap;

/**
 * ObserverVorhersage
 */

public class ObserverVorhersage 
    implements Observer
{
    private Float luftdruckOld;
    private Float luftdruckNew;
    
    private static final int SMALLER = -1;
    private static final int BIGGER = 1;
    
    /**
     * @return 
     */
    public String vorhersage() {
        int comparison = Float.compare(luftdruckOld, luftdruckNew);
        String result = "Luftdruck ist gleichgeblieben";
        
        if (comparison == SMALLER) {
            result = "Luftdruck ist gesunken";
        } else if (comparison == BIGGER) {
            result = "Luftdruck ist gestiegen";
        } 
        
        return result;
    }
    
    /**
     * @param arg 
     */
    @Override
    public void update(HashMap<String, Object> arg) {
        Wetterdaten wetterdaten = (Wetterdaten) arg.get(SubjectTypes.TYPE_WETTERDATEN);
        
        if (luftdruckNew == null) {
            luftdruckNew = wetterdaten.getLuftdruck();
            luftdruckOld = 0f;
        } 
        
        luftdruckOld = luftdruckNew;
        luftdruckNew = wetterdaten.getLuftdruck();
    }
}