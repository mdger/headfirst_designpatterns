package designpatterns.decorator.text;

/**
 * TextFilterCaps
 */
public class TextFilterCaps 
    extends TextFilter
{
    public TextFilterCaps(Text text) {
        super(text);
    }

    @Override
    public String text() {
        return getTextObject().text().toUpperCase();        
    }
}