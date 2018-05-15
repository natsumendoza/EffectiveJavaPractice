package UnnecessaryObjects;

public class LongCreationSlow {

    // Hideously slow!
    private static long sum() {

        // prefer primitives to boxed primitives, and watch out for unintentional
        // autoboxing.
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

}
