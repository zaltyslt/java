
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
     	//©KS
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName ="";
        
        while(true) {
        	 firstName = scanner.nextLine();
        	 if (firstName.isEmpty()) {break;}       	       	
        	String lastName = scanner.nextLine();
        	String id = scanner.nextLine();
        	
        	infoCollection.add(new PersonalInformation(firstName, lastName, id));
        	
        } 
        
        for (PersonalInformation personalInformation : infoCollection) {
			
		
		System.out.println(personalInformation.getFirstName()+" "+ personalInformation.getLastName()+ "\n");
		}
    }
}
