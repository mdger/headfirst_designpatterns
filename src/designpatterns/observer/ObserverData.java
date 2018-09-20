package designpatterns.observer;

import java.util.HashMap;

/**
 * ObserverData
 */

public class ObserverData {
    private final HashMap<String, Object> map = new HashMap<>();

    /**
     * @return the map
     */
    public HashMap<String, Object> getMap() {
        return map;
    }
}