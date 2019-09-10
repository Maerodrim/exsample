public class Main {

    public static void main(String[] args) {
        IdenticalOperation firstOperation=new IdenticalOperation();
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
        System.out.println(firstOperation.apply(5));
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}

