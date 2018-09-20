package designpatterns.decorator.text;

/**
 * TextFilterLeezeichen
 */
public class TextFilterLeezeichen 
    extends TextFilter
{
    public TextFilterLeezeichen(Text text) {
        super(text);
    }

    @Override
    public String text() {
        String text = getTextObject().text();
        text = text.replace(" .", ".");
        text = text.replace("  ", " ");
        return text;
    }
    
}