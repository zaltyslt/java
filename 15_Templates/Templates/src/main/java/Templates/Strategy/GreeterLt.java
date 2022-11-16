package Templates.Strategy;

public class GreeterLt extends Greeter {

    public void greet(String fName, String lName, int ending) {

        super.greet(fName, lName, ending);
    }

    @Override
    protected String getGreetingString() {

        return "Sveiki";
    }

    @Override
    protected String getEndingString(int type) {
      switch (type){
          case 1:
          return "!";

          case 3:
          return "!!!";

      }
      return ".";
    }
}
