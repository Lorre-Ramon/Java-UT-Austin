import java.sql.SQLOutput;
import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        int[] initKeyArray = {0,1,2,3,4};
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u'};

        System.out.print("Type in the string: ");
        String inputString = scnr.nextLine();

        System.out.print("Type in the key (integer between 1 and 5): ");
        int inputKey = scnr.nextInt();

        char[] inputArray = inputString.toCharArray();
        char[] reversedInputArray = new char[inputArray.length];

        // reverse the input String
        for (int i=1; i<=inputArray.length; i++) {
            reversedInputArray[inputArray.length - i] = inputArray[i-1];
        }

        // output the result
        for (int i=0; i<inputArray.length; i++) {
            for (int j=0; j<vowelsArray.length; j++) {
                if (reversedInputArray[i] == vowelsArray[j]) {
                    String str = String.valueOf(inputKey + j);
                    reversedInputArray[i] = str.toCharArray()[0];
                }
            }
        }
        System.out.println(reversedInputArray);
    }

}
