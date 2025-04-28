import java.util.*;

public class VowelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char choice = sc.next().charAt(0);

        // Convert character to uppercase to handle both uppercase and lowercase vowels
        char ch = Character.toUpperCase(choice);
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(choice + " is a Vowel");
                break;
            default:
                System.out.println(choice + " is Not a Vowel");
        }

       }
}