package src;
public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String name;
    private int phoneNumber;

    public User (String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setphoneNumber (int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message

    public void Register(){
    System.out.println("Nama :" + name);
    System.out.println("No Handphone :" + phoneNumber);
    }
}
