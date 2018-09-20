package designpatterns.decorator.text;

/**
 * Text
 */
public abstract class Text {
    /** */
    private String text;

    /**
     * 
     */
    protected Text() {}

    /**
     * @param text
     */
    public Text(String text) {
        this.text = text;
    }

    /**
     * 
     */
    public abstract String text();

    /**
     * @return the text
     */
    protected String getText() {
        return this.text;
    }

    /**
     * @param text the text to set
     */
    protected void setText(String text) {
        this.text = text;
    }
}