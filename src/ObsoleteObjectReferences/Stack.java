package ObsoleteObjectReferences;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // Problem of the stack grows, every pop of elements will not be garbaged collected
    // and will cause NotEnoughMemory error (rarely)
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();

        // Solution
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference

        return elements[--size];
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
