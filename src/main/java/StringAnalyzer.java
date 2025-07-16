import java.util.Calendar;
import java.util.Scanner; // Import the Scanner class to read user input

public class StringAnalyzer {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String inputString = scanner.nextLine(); // Read the entire line of input from the user

        System.out.println("Original String: " + inputString);
        // Add Your Code after this line

        // init variables
        int cntVowels = 0;
        int cntConsonants = 0;
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

        for (char ch : inputString.toCharArray()) {
            ch = Character.toLowerCase(ch);

            if (!Character.isLetter(ch)) {
                continue;
            }

            // check if the character is a vowel
            boolean isVowel = false;
            for (char v : vowelsArray) {
                if (ch == v) {
                    isVowel = true;
                }
            }

            if (isVowel) {
                cntVowels ++;
            } else {
                cntConsonants ++;
            }
        }

        // output the results
        System.out.printf("Number of Vowels: %d\n", cntVowels);
        System.out.printf("Number of Consonants: %d\n", cntConsonants);
    }
}