/**
 * Demonstrates that Java is always pass-by-value.
 */
public class PassByValueDemo {

    // Mutates the object through a copied reference.
    static void rename(Person p) {
        p.rename("Alan Turing");
    }

    // Reassigns only the local copy of the reference.
    static void replace(Person p) {
        p = new Person("Ada Lovelace");
    }

    public static void main(String[] args) {
        Person person = new Person("John von Neumann");

        rename(person);
        System.out.println("After rename: " + person.getName());

        replace(person);
        System.out.println("After replace: " + person.getName());
    }
}