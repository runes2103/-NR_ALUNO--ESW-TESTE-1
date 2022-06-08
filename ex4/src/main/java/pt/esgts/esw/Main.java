package pt.esgts.esw;
import PasswordStrength.STRONG;
import pt.brunojesus.esgts.pgenlib.model.PasswordStrength;
public class Main {
    public static void main(String[] args) {
        final PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();

        Object PasswordStrength = null;
        String password = passwordGeneratorFacade.generatePassword(STRONG);

        System.out.println("Your new password is: " + password);
    }
}