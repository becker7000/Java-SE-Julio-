public class User {

    //Atributos o variables de campo:
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    // Constructor (método que nos permite crear tantos usuarios como queramos)
    public User(String name, String email){
        this.name = name; // this se usa para evitar la colisión de variables
        this.email = email;
    }

    // Getter para el nombre:
    public String getName(){
        return name;
    }

    // Setter para nombre:
    public void setName(String name){
        this.name = name;
    }

    // Getter para el email:
    public String getEmail(){
        return email;
    }

    // Setter para el email:
    public void setEmail(String email){
        this.email = email;
    }

    // Getter para el address:
    public String getAddress(){
        return address;
    }

    // Setter para el address:
    public void setAddress(String address){
        this.address = address;
    }

    // Getter para el phoneNumber:
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // Setter para el phoneNumber:
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // Método personalizado para mostrar en consola al usuario:
    public void showUser(){
        System.out.print("\n\t +----------User-----------+");
        System.out.print("\n\t | Name: "+name);
        System.out.print("\n\t | Email: "+email);
        System.out.print("\n\t +-------------------------+");
    }

}
