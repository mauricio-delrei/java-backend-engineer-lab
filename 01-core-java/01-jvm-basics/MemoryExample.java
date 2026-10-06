import java.lang.ref.WeakReference;

/**
 * Demonstrates object reachability and garbage collection eligibility.
 */
public class MemoryExample {

    public static void main(String[] args) throws InterruptedException {

        Person person1 = new Person("John von Neumann");

        // Copies the reference, not the object.
        Person person2 = person1;

        // A weak reference does not prevent the object from being collected.
        WeakReference<Person> weak = new WeakReference<>(person1);

        person1 = null;

        System.gc();
        Thread.sleep(200);

        System.out.println(
                "After person1 = null -> alive? "
                        + (weak.get() != null)
        );

        person2 = null;

        System.gc();
        Thread.sleep(200);

        System.out.println(
                "After person2 = null -> alive? "
                        + (weak.get() != null)
        );
    }
}