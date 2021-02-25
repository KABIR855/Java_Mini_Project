
package miniproject;


public class Condition {
    protected int condition;
   

    public Condition(int condition) {
        this.condition = condition;
        
    }

    
   void Show(){
        System.out.println("                                            Vehicles Condition Information");
        System.out.println("\n");
       System.out.println("Condition:"+condition);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
  System.out.println("\n");
   }
}
