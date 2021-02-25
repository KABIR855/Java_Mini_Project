
package miniproject;

// Use of inheritance
// Is A Relationship 
public class Police extends User {
    private Location L1;
    private String Rank,POname;
    private int Location ;
    private Condition C1;
    private Driver D1;
    private Registration R1;
    public Police(String Rank, String POname, int Location , String id, String name, String contact, String address, String profession) {
        super(id, name, contact, address, profession);
        this.Rank = Rank;
        this.POname = POname;
        this.Location=Location;
    }

    @Override
    void show() {
        System.out.println("                                            Police Information");
        System.out.println("\n");
        System.out.println(" Rank:"+Rank+" Police Station Name:"+POname+" Location:"+Location+" ID:"+id+" Name:"+name+" contact"+contact+" Address:"+address+" Profession:"+profession);
       System.out.println("\n");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        }
    void Checkinfo(){
    
    
         System.out.println("                                       Vehicles Location Tracking");
        if(Location==1){
   
            System.out.println("                            Check Driver License And Registration Information");
             System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n");
                    
                   
                        
                    }
        
        }

    
}
    

   
    
    
    


