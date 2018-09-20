/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.decorator.getraenke;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco
 */
public class GetraenkHausmischungTest {
    /**
     * Test of preis method, of class GetraenkHausmischung.
     */
    @Test
    public void testPreis() {
        Getraenk getraenkHausmischung = new GetraenkHausmischung();
        getraenkHausmischung = new ZutatenKuhmilch(getraenkHausmischung);
        getraenkHausmischung = new ZutatenSchoko(getraenkHausmischung);
        getraenkHausmischung = new ZutatenZucker(getraenkHausmischung);
        
        float expResult = 1.62f;
        float result = getraenkHausmischung.preis();
        assertEquals(expResult, result, .1f);
    }
    
}
