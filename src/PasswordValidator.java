public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }

        boolean hasMinimumLength = password.length() >= 8;
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSymbol = password.matches(".*[^a-zA-Z0-9].*");

        return hasMinimumLength && hasDigit && hasSymbol;
    }
}