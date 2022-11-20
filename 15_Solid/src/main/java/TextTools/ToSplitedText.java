package TextTools;

import java.util.Arrays;

public class ToSplitedText implements ITextTransformer{
    @Override
    public String convert(String text) {
        String string = "";
        for(String c: text.split("")){
            string += c + " ";
        }
         return string;
    }
}
