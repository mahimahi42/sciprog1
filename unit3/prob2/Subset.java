import java.util.Scanner;

/**
 * This program determines if two entered strings are subsets of each other.
 **/
public class Subset {
    public static boolean contains(String a, String b) {
        int count = 0;
        
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                }
            }
        }

        if (a.length() == count) {
            return true;
        } else {
            return false;   
        }
    }

    public static void main(String[] args) {
        System.out.println("Checking for subsets - distinct letters only");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first word");
        // This is called method chaining. Since scanner.nextLine() returns a String,
        // we can just directly chain toLowercase() to it.
        String a = scanner.nextLine().toLowerCase();
        System.out.println("Input second word");
        String b = scanner.nextLine().toLowerCase();

        if (contains(a, b) && contains(b, a)) {
            System.out.println("Both are subsets of each other");
        } else if (contains(a, b) && !contains(b, a)) {
            System.out.println(a + " is a subset of " + b);
        } else if (contains(b, a) && !contains(a, b)) {
            System.out.println(b + " is a subset of " + a);
        } else {
            System.out.println("Neither is a subset of the other");
        }
    }
}
