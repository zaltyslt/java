package userIO;

import TextTools.ITextTransformer;
import TextTools.ToLowerCase;
import TextTools.ToSplitedText;
import TextTools.ToUppercase;

import static java.lang.String.valueOf;

public class ProcessUI {
    private String userString;

    public ProcessUI() {
        this.userString = "";

    }

    public ProcessUI(String input) {
        this.userString = input;
        this.transform(input);
    }


    public String transform(String input) {
        int colonIdx = input.indexOf(':');

        String transformType = valueOf(input.substring(0, colonIdx)).toLowerCase();
        String text = input.substring(colonIdx + 1);
        ITextTransformer transform;

        if (transformType.toLowerCase().equals("lowercase")) {
            transform = new ToLowerCase();
        } else if (transformType.toLowerCase().equals("uppercase")) {
            transform = new ToUppercase();
        }else if (transformType.toLowerCase().equals("split")) {
            transform = new ToSplitedText();
        } else {
            throw new IllegalArgumentException("Transformation type is not supported: " + transformType);
        }

        return transform.convert(text);
    }

    @Override
    public String toString() {
        return null;
    }
}
