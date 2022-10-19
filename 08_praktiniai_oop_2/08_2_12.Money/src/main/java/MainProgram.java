
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
//    	Money firstMoneyObject = new Money(1, 0);
    	Money firstMoneyObject = new Money(-3, 0);
    	Money secondMoneyObject = new Money(1, 5);
    	
        Money thirdMoneyObject = new Money(-3, 5);
        Money fourthMoneyObject = new Money(2, 0);
        
        thirdMoneyObject.lessThan(firstMoneyObject); 
    }
}
