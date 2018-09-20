package designpatterns.observer;

/**
 * ObserverAktuelleBedingungen
 */
public class ObserverAktuelleBedingungen 
    implements Observer
{
    @Override
    public void update(ObserverData arg) {
        Wetterdaten wetterdaten = (Wetterdaten) arg.getMap().get("wetterDaten");
    }
}