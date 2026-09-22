import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void passwordLongerThanEightCharactersIsValid() {
        assertTrue(validator.isValid("Abc1!xyz"));
    }

    @Test
    void passwordShorterThanEightCharactersIsInvalid() {
        assertFalse(validator.isValid("Ab1!xyz"));
    }

    @Test
    void passwordWithoutADigitIsInvalid() {
        assertFalse(validator.isValid("Password!"));
    }

    @Test
    void passwordWithoutASymbolIsInvalid() {
        assertFalse(validator.isValid("Password1"));
    }

    @Test
    void nullPasswordThrowsAnException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> validator.isValid(null)
        );
    }
}