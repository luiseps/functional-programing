package funcioninterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid.test("+5799999999"));
        System.out.println(isPhoneNumberValid.test("+579999999"));
        System.out.println(isPhoneNumberValid.test("+0799999999"));

        System.out.println(isPhoneNumberValid.and(containsNumber3).test("+5799999999"));
        System.out.println(isPhoneNumberValid.and(containsNumber3).test("+5793999999"));
    }

    static Predicate<String> isPhoneNumberValid = phoneNumber ->
            phoneNumber.startsWith("+57") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
