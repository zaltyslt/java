
public class Main {

    public static void main(String[] args) {

        // Try out your class here
    	Message msg = new Message("asei", "nuKaTu?");
    	MessagingService msgS = new MessagingService();
    	msgS.add(msg);
    	System.out.println(msgS.getMessages());
    }
}
