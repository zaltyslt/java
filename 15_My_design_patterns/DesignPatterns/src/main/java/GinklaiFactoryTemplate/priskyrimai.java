package GinklaiFactoryTemplate;

public class priskyrimai {
    public static void main(String[] args) {
     int i =10;
     int j = 12;
     i = ++j;
        System.out.println(i);
    }
}

interface I{
    int number = 10;
}

class Base {
    public void show(){
        System.out.println("Base show called");
    }
}

class Derived extends Base{
   public void show(){

       System.out.println("Derived show called");
   }
}