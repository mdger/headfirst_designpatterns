package designpatterns.decorator.text;

/**
 * TextPlain
 */
public class TextPlain 
    extends Text 
{
    /**
     * @param text
     */
    public TextPlain(String text) {
        super(text);
    }

    @Override
    public String text() {
        return getText();
    }
}