package service;

public class ValidationService {
    public static boolean isPositiveNumber(double number) {
        return number > 0;
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !str.trim().isEmpty();
    }
}
