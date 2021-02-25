
package miniproject;

public class Location {
   
    
    protected int location;
    private String route;

    public Location(int location, String route) {
        this.location = location;
        this.route = route;
    }
    void show(){
         System.out.println("                                            Location  Information");
        System.out.println("\n");
        System.out.println("Location:"+location+" Route:"+route);
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.println("\n");
    }
    
}
