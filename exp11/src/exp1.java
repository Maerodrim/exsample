public class exp1 {

    public static void main(String[] args) {
        // write your code here
    }
}
class Person {
    private int passportId;
    private String firstName;
    private String lastName;
    int getPassportId(){return passportId;}
    String getFirstName(){return firstName;}
    String  getLastName(){return lastName;}
    public String setFirstName(String firstName){
        this.firstName=firstName;
        return firstName;
    }
    public String setLastName(String lastName){
        this.lastName=lastName;
        return lastName;
    }
    public int setPassportId(int passportId){
        this.passportId=passportId;
        return passportId;
    }
}

