
package miniproject;


public class Registration {
 
    protected int regid;
  

    public Registration( int regid) {
       
        this.regid = regid;
       
    }
    void Show(){
         System.out.println("                                            Registration Information");
        System.out.println("\n");
        System.out.println("Registration ID:"+regid);
         System.out.println("-----------------------------------------------------------------------------------------------------------------------");
   System.out.println("\n");
    }
        void Checkinfo1(){
    
    
         System.out.println("                                         Check Vehicles Registration NO");
        if(regid==1){
    } else {
            System.out.println("                                         Registration Not ok");
            System.out.println("                                            Check License NO");
             System.out.println("-----------------------------------------------------------------------------------------------------------------------");
              System.out.println("\n");
                    
                   
                        
                    }
        
        }

    
}
