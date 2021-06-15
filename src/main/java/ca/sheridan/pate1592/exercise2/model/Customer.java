package ca.sheridan.pate1592.exercise2.model;

public class Customer {
    private int customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private String street;
    private String city;
    private String state;
    private String zip_code;

    public Customer(int customer_id, String first_name, String last_name, String email, String street, String city, String state, String zip_code) {
        this.customer_id=customer_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.street=street;
        this.city=city;
        this.state=state;
        this.zip_code=zip_code;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getfirst_name(){
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String Street) {
        this.street = Street;
    }

    public String getState(){
        return state;
    }

    public void setState(String State) {
        this.state = State;
    }

    public String getZip_code(){
        return zip_code;
    }

    public void setZip_code(String Zip_code) {
        this.zip_code = Zip_code;
    }

}
