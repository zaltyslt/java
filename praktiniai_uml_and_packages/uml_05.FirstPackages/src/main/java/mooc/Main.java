package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class Main {

    public static void main(String[] args) {
        //Pakuriamas klases, kuri atliks veiksma objektas
    	//jei turetume kita klase, tarkim GUI, galima butu pakurti jos objekta
        UserInterface ui = new TextInterface(); //
        
        
        //pakuriamas objektas, kuri kuriant, jam nurodant, kuri klase atliks jo tam
        //tikra veiksma
        ApplicationLogic al = new ApplicationLogic(ui);
        
        
        al.execute(3);
}
}