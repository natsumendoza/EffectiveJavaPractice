package NoninstantiableClass;

// Noninstantiable utility class
public class UtilityClass {

    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        // The AssertionError isn’t strictly required, but it provides insurance in case
        // the constructor is accidentally invoked from within the class.
        throw new AssertionError();
    }

}
