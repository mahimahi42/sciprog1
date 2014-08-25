import java.util.Scanner;

/**
 * This program determines if a sentence is a palindrome
 **/
public class Sentence_Extract_Words {
    public static boolean is_palindrome(String input) {
        String y = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            y += input.charAt(i);
        }
        if (y.equals(input)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Checking for Palindromes");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your sentence");
        String sentence1 = scanner.nextLine();
        String sentence = sentence1.toLowerCase();
        String letters = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                letters += sentence.charAt(i);
            }
        }

        if (is_palindrome(letters)) {
            System.out.println(sentence1 + " is a palindrome");
        } else {
            System.out.println(sentence1 + " isn't a palindrome");
        }
    }
}
