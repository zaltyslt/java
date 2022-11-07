
public class MainProgram {//©KS

    public static void main(String[] args) {
    	Employees university = new Employees();
    	university.add(new Person("Petrus", Education.PHD));
    	university.add(new Person("Arto", Education.HS));
    	university.add(new Person("Elina", Education.PHD));
   // 	university.print();
    	System.out.println("==");
    	university.print(Education.PHD); 
    
    	university.fire(Education.PHD);
    	System.out.println("==");
    	university.print();
    	
//   Employees	t = new Employees(); 
//   Person h = new Person("Arto", Education.PHD); 
//    	t.add(h); 
//    	t.print(Education.PHD); 
//    	t.print(Education.PHD); 
//        
    }
}
