package TextTools;

public class ToLowerCase implements ITextTransformer{


    @Override
    public String convert(String text) {
        if(text != null){
            return text.toLowerCase();
        }else{
            return "";
        }
    }
}
