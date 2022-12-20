package pvz.patterns.templatemethod;

 public class Programmer extends Worker {
	@Override
    public void workingProcess() {
        System.out.println(" > I drink coffee");
        System.out.println(" > I write code");
        System.out.println(" > I drink coffee again");
        System.out.println(" > I write code again");
    }
 }

 
 