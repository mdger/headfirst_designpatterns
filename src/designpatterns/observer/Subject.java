package designpatterns.observer;

import java.util.LinkedList;

public abstract class Subject 
{
    private final LinkedList<Observer> observers = new LinkedList<Observer>();


    /**
     * 
     * @param observer
     * 
     */
    
    public void addObserver(Observer observer) 
    {
        observers.add(observer);
        System.out.println("Objekt hinzugefügt");
    }


    /**
     * 
     * @param observer
     * 
     */
    
    public void deleteObserver(Observer observer) 
    {
        if (observers.remove(observer)) 
        {
            System.out.println("Objekt gelöscht");
        }
    }


    /**
     * Diese Methode kontaktivert alle Observer und übergibt <code>arg</code> an alle update()-Methoden
     * @param arg die Argumente die man übergeben möchte
     */

    public void notifyObservers(ObserverData arg) 
    {
        for (Observer o : observers) 
        {
            o.update(arg);
        }
    }
}