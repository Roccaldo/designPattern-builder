public class Main {
    public static void main(String[] args) {
        PersonBuilder first_person = new PersonBuilder();
        first_person.setFirstName("Mario");
        first_person.setLastName("Rossi");
        first_person.setAge(23);
        first_person.setAddress("via aldo moro, 56");

        PersonBuilder second_Person = new PersonBuilder();
        second_Person.setFirstName("Giovanna");
        second_Person.setLastName("Arcuri");
        second_Person.setAge(45);
        second_Person.setAddress("via giuliano, 48");
        second_Person.build();

        System.out.println(first_person.build());
        System.out.println(second_Person.build());
    }
}