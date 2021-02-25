
// Use of inheritance
// Is A Relationship 
package miniproject;


public class Admin extends User {

    public Admin(String id, String name, String contact, String address, String profession) {
        super(id, name, contact, address, profession);
    }

    @Override
    void show() {
         System.out.println("                                            Admin Information");
        System.out.println("\n");
        System.out.println( " ID:"+id+" Name:"+name+" contact"+contact+" Address:"+address+" Profession:"+profession);
         System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }

  
   
}
