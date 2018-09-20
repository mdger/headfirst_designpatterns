/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco
 */
public class SubjectWetterstationTest {
    /**
     * Test of setWetterdaten method, of class SubjectWetterstation.
     */
    @Test
    public void testSetWetterdaten() {
        float temperatur = 25;
        float feuchtigkeit = 2.3f;
        float luftdruck = 2.5f;
                
        Wetterdaten wetterdaten = new Wetterdaten(temperatur, feuchtigkeit, luftdruck);
        SubjectWetterstation subjectWetterstation = new SubjectWetterstation(wetterdaten);
            
        ObserverAktuelleBedingungen currentCondition = new ObserverAktuelleBedingungen();
        ObserverVorhersage weatherForcast = new ObserverVorhersage();
        
        subjectWetterstation.addObserver(currentCondition);
        subjectWetterstation.addObserver(weatherForcast);
        subjectWetterstation.notifyObservers();
        
        assertEquals("Aktuelle Temperatur: 25.0 Aktuelle Luftfeuchtigkeit: 2.3 Aktueller Luftdruck: 2.5", currentCondition.aktuelleBedingungen());
        assertEquals("Luftdruck ist gleichgeblieben", weatherForcast.vorhersage());
        
        temperatur = 25;
        feuchtigkeit = 2.3f;
        luftdruck = 5f; 
        Wetterdaten wetterdaten2 = new Wetterdaten(temperatur, feuchtigkeit, luftdruck);
        
        subjectWetterstation.setWetterdaten(wetterdaten2);
        subjectWetterstation.deleteObserver(weatherForcast);
        subjectWetterstation.notifyObservers();
        
        assertEquals("Aktuelle Temperatur: 25.0 Aktuelle Luftfeuchtigkeit: 2.3 Aktueller Luftdruck: 5.0", currentCondition.aktuelleBedingungen());
        assertEquals("Luftdruck ist gleichgeblieben", weatherForcast.vorhersage());
        
    }
    
}
