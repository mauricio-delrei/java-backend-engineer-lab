/**
 * Demonstrates StackOverflowError and OutOfMemoryError.
 */
public class StackAndHeapErrors {

    static int depth = 0;

    // Each recursive call creates another stack frame.
    static void recurse() {
        depth++;
        recurse();
    }

    public static void main(String[] args) {

        try {
            recurse();
        } catch (StackOverflowError error) {
            System.out.println(
                    "StackOverflowError at depth: " + depth
            );
        }
    }
}