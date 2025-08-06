package skitlogincredentials;
import java.util.Random;
import java.util.Scanner;
public class CredentialsGenerator {

	private String firstName;
    private String lastName;
    private String department;

    public CredentialsGenerator(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public String generateEmail() {
        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + ".skit.org.in";
    }

    public String generatePassword(int length) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "@#$%&*!";
        String allChars = capitalLetters + smallLetters + numbers + specialChars;

        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        password.append(capitalLetters.charAt(rand.nextInt(capitalLetters.length())));
        password.append(smallLetters.charAt(rand.nextInt(smallLetters.length())));
        password.append(numbers.charAt(rand.nextInt(numbers.length())));
        password.append(specialChars.charAt(rand.nextInt(specialChars.length())));
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(rand.nextInt(allChars.length())));
        }
        return password.toString();
    }
    public void displayCredentials(String email, String password) {
        System.out.println("\nGenerated Credentials");
        System.out.println("-------------------------------------------------------");
        System.out.println("Email    : " + email);
        System.out.println("Password : " + password);
    }
    public static void main(String[] args) {
        String firstName = "Swetha";
        String lastName = "P";
        int choice = 1; // 1. CSE
        String department;
        switch (choice) {
            case 1: department = "CSE";
                	break;
            case 2: department = "ISE";
            		break;
            case 3:	department = "AIML";
                	break;
            case 4: department = "Civil";
            		break;
            case 5: department = "Mechanical";
                	break;
            case 6: department = "VLSI";
                	break;
            case 7: department = "ECE";
                	break;
            default: department = "General";
        }
        CredentialsGenerator generator = new CredentialsGenerator(firstName, lastName, department);
        String email = generator.generateEmail();
        String password = generator.generatePassword(10);
        generator.displayCredentials(email, password);
    }
}