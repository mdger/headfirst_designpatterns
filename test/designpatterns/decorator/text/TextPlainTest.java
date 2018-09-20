/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.decorator.text;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco
 */
public class TextPlainTest {
    /**
     * Test of text method, of class TextPlain.
     */
    @Test
    public void testText() {
        String text = "Ich  bin  Marco .";
        Text textPlain = new TextPlain(text);
        textPlain = new TextFilterCaps(textPlain);
        textPlain = new TextFilterLeezeichen(textPlain);
        
        String expResult = "ICH BIN MARCO.";
        String result = textPlain.text();
        assertEquals(expResult, result);
    }
}