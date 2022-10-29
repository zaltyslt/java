import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
//Saskaita sask = new Saskaita("As", "Pats");
//Saskaita saskC = new kredSaskaita("As", "Pats", 500);

SaskRegistras registras = new SaskRegistras();


registras.addToReg(new Saskaita("Jonis", "Jo"));
registras.addToReg(new KredSaskaita("Dzonis", "Ryzas", 500));

Saskaita s1= registras.getFromReg(0);

System.out.println(s1.getfName()+" "+s1.getlName());
System.out.println(s1.getAccountNo() );
System.out.println(s1.balance);
s1.addMoney(200);
s1.takeMoney(150);
s1.takeMoney(100);
System.out.println(s1.balance);

Saskaita s2= registras.getFromReg(1);
System.out.println(s2.getfName()+" "+s2.getlName());
System.out.println(s2.getAccountNo() );
System.out.println(s2.balance);
s2.addMoney(200);
s2.takeMoney(150);
s2.takeMoney(100);
System.out.println(s2.balance);
s2.addMoney(300);
System.out.println(s2.balance);




}
}