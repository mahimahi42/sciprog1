import java.util.Scanner;

/**
 * This program demonstrates the <code>compareTo()</code> method of the String class
 **/
public class Comparing_Strings {
    public static void main(String[] args) {
        System.out.println("Comparing Strings");
        Scanner scanner = new Scanner(System.in);

        System.out.println("First word?");
        String word1 = scanner.nextLine();
        
        System.out.println("Second word?");
        String word2 = scanner.nextLine();

        if (word1.compareTo(word2) < 0) {
            System.out.println(word1 + " is less than " + word2);
        } else if (word1.compareTo(word2) == 0) {
            System.out.println(word1 + " is equal to " + word2);
        } else {
            System.out.println(word1 + " is greater than " + word2);
        }
    }
}
