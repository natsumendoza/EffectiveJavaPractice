package UnnecessaryObjects;

public class BadPractice {

    // Performance can be greatly improved!
    static boolean isRomanNumeral (String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

}
