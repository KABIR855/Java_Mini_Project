
package miniproject;

//Abstract class Declaration
public abstract class  User {
    
    protected String id,name,contact,address,profession;

    public User(String id, String name, String contact, String address, String profession) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.profession = profession;
    }
    
 //Abstract Method Declaration
  abstract void show();
}