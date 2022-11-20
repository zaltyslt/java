package TextTools;

public class ToUppercase implements ITextTransformer {

    @Override
    public String convert(String text) {
        if(text != null){
            return text.toUpperCase();
        }else{
            return "";
        }
    }

}
