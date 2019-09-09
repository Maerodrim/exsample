class Person {
    private int passportId;
    private String firstName;
    private String lastName;
    int getPassportId(){return passportId;};
    String getFirstName(){return firstName;};
    String  getLastName(){return lastName;};
    public String setFirstName(String firstName){
        this.firstName=firstName;
        return firstName;
    };
    public String setLastName(String lastName){
        this.lastName=lastName;
        return lastName;
    };
    public int setPassportId(int passportId){
        this.passportId=passportId;
        return passportId;
    };
    public Person(int passportId){
        this.passportId=passportId;
    };
    public Person(){
    }
    public Person(String firstName , String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public Person(String firstName , String lastName , int passportId){
        this.firstName=firstName;
        this.lastName=lastName;
        this.passportId=passportId;
    }
}

