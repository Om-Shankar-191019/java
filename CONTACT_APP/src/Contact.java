public class Contact {
    private String name;
    private String phoneNo;
    private String email;

    public Contact(String name, String phoneNo, String email){
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getFullDetail(){
        String res = String.format("Name : %s , Phone no : %s , Email : %s", this.name, this.phoneNo, this.email);
        return res;
    }
}
