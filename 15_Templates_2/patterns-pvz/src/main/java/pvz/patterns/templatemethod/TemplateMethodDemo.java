package pvz.patterns.templatemethod;

 public class TemplateMethodDemo {
    public static void main(String[] args) {
        Worker programmer = new Programmer();
        Worker actor = new Actor();
        programmer.work();
        System.out.println("-------------");
        actor.work();
    }
 }
 
 


