
package miniproject;

// Use of inheritance
// Is A Relationship 
public class Driver extends User{
    private Registration R1;
    private String cn;
    protected int driln;
    private Vehicles V1;

    public Driver(Registration R1, int driln, String cn, String id, String name, String contact, String address, String profession, Vehicles V1) {
        super(id, name, contact, address, profession);
        this.R1 = R1;
        this.driln = driln;
        this.cn = cn;
        this.V1=V1;
    }

  

    @Override
     void show() {
          System.out.println("                                            Driver Information");
        System.out.println("\n");
        System.out.println(" Registration ID:"+R1.regid+" Driving License NO::"+driln+" Company Name:"+cn+" ID:"+id+" Name:"+name+" contact"+contact+" Address:"+address+" Profession:"+profession+" Vehicles Id:"+V1.vid);
         System.out.println("-----------------------------------------------------------------------------------------------------------------------");
       System.out.println("\n");
    }
          void Checkinfo2(){
    
    
        
        if(driln==2){
             System.out.println("                                            License Is Not Ok");
             System.out.println("                                            Stop The card");
              System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    } else {
           
                    System.out.println("                                            License Is ok");
                    System.out.println("                                            The Car Is OK");
                     System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                   
                        
                    }
        
        }
    
}
