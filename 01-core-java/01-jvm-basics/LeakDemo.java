import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates a memory leak caused by an unnecessary static reference.
 */
public class LeakDemo {

    // The static collection can keep objects reachable for the lifetime
    // of the class loader.
    static final List<Person> CACHE = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Person person = new Person("John von Neumann");

        CACHE.add(person);

        // The local reference is gone, but CACHE still references the object.
        person = null;

        System.out.println("Person added to the static cache.");

        Thread.sleep(60000);
    }
}