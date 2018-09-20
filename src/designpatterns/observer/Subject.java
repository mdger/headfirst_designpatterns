package designpatterns.observer;

import java.util.HashMap;
import java.util.LinkedList;

public abstract class Subject 
{
    private final LinkedList<Observer> observers = new LinkedList<Observer>();

    private final HashMap<String, Object> observerData = new HashMap<>();
    
    /**
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Objekt hinzugefügt");
    }

    /**
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        if (observers.remove(observer)) {
            System.out.println("Objekt gelöscht");
        }
    }

    /**
     * Diese Methode kontaktivert alle Observer und übergibt <code>arg</code> an alle update()-Methoden
     * @param arg die Argumente die man übergeben möchte
     */
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(observerData);
        }
    }

    /**
     * @return 
     */
    public HashMap<String, Object> getObserverData() {
        return observerData;
    }
}