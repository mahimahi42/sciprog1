import java.util.Scanner;

/**
 * This program strips words of repeating letters, or reports if there are none.
 **/
public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word");
        String word = scanner.nextLine();
        String ans = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < ans.length(); j++) {
                if (word.charAt(i) == ans.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                ans += word.charAt(i);
            }
        }

        if (word.equals(ans)) {
            System.out.println("No repeated letters");
        } else {
            System.out.println(ans);
        }
    }
}
