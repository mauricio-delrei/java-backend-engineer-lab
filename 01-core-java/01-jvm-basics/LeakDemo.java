import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates a memory leak caused by an unnecessary static reference.
 */
public class LeakDemo {

    // The static collection can keep objects reachable for the lifetime
    // of the class loader.
    private static final List<Person> CACHE = new ArrayList<>();

    public static void main(String[] args) {
        Person person = new Person("John von Neumann");

        CACHE.add(person);

        System.out.println("Cache size after adding person: " + CACHE.size());

        person = null;

        System.out.println("Local reference set to null.");
        System.out.println("Cache size after null assignment: " + CACHE.size());

        CACHE.clear();

        System.out.println("Cache size after clearing cache: " + CACHE.size());
    }
}