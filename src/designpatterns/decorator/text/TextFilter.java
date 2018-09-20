package designpatterns.decorator.text;

/**
 * TextFilter
 */
public abstract class TextFilter 
    extends Text
{
    private Text textObject;

    public TextFilter(Text textObject) {
        this.textObject = textObject;
    }

    protected Text getTextObject() {
        return textObject;
    }
}