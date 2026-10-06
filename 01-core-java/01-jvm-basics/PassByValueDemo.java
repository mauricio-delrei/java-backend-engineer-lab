/**
 * Demonstrates that Java is always pass-by-value.
 */
public class PassByValueDemo {

    // The parameter receives a copy of the reference.
    // Both references still point to the same object,
    // so mutating the object is visible to the caller.
    static void rename(Person p) {
        p.name = "Alan Turing";
    }

    // Only the local copy of the reference is reassigned.
    // The caller's reference remains unchanged.
    static void replace(Person p) {
        p = new Person("Ada Lovelace");
    }

    public static void main(String[] args) {

        Person person = new Person("John von Neumann");

        rename(person);

        System.out.println("After rename: " + person.name);

        replace(person);

        System.out.println("After replace: " + person.name);
    }
}