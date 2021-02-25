
package miniproject;


public class MiniProject {

    public static void main(String[] args) {
     
    
    
    Registration R1= new Registration(0);
    Condition C1= new Condition (0);
    Location L1 = new Location(1,"Mirpur");
    L1.show();
    Vehicles V1; 
     V1 = new Vehicles("v111","Bus","Thikana","Toyota11","Toyota",C1,L1);
      Police  P1 = new Police ("Sargent.","Lalbag.",1,"P1.","Anis Rahman.","1521438421.","Lalbag,Dhaka.","Police.");
    P1.show();
    Admin A1 = new Admin ("A1.","Rahman Khan.","1303026128.","Lalbag.","Admin.");
    A1.show();
    
     Driver D1 = new Driver (R1,0,"Thikana","D1.","Arif Khan.","19734850.","Dinajpur.","Driver.",V1);
    D1.show();
     
    V1.show();
    P1.Checkinfo();
    R1.Checkinfo1();
    D1.Checkinfo2();
    
   
   
    }

    

   

  
}
