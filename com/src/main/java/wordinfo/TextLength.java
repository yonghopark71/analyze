package wordinfo;


public class TextLength {
    String text ;
    Integer withSpaces = 0;
    Integer withoutSpaces = 0;

    public TextLength(final String text) {
        this.text = text;
        withSpaces = this.text.length();
        withoutSpaces = this.text.replaceAll(" ", "").length();
    }


    public int getWithSpaces() {
        return withSpaces;
    }

    public void setWWithSpaces(final int withSpaces) {
        this.withSpaces = withSpaces;
    }

    
    public int getWithoutSpaces() {
        return withoutSpaces;
    }

    public void setWithoutSpaces(final int withoutSpaces) {
        this.withoutSpaces = withoutSpaces;
    }

}
