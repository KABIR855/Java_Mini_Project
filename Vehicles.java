
package miniproject;


public class Vehicles {
    protected String vid;
    private String type,name,model,brand;
    private Location L1;
    private Condition C1;
    public Vehicles(String vid, String type, String name, String model, String brand, Condition C1,Location L1) {
        this.vid = vid;
        this.type = type;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.C1 = C1;
        this.L1=L1;
    }

  

   
    void show(){
         System.out.println("                                            Vehicles Information");
        System.out.println("\n");
    
        System.out.println(" Vehicles ID:"+vid+" Vehicles Type:"+type+" Vehicles Name:"+name+" Vehicles Model:"+model+" Brand:"+brand+" Condition:"+C1.condition+" Location"+L1.location);
         System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.println("\n");
    }

   
    
    
}
