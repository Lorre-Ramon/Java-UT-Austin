public class Array {

    public static void main(String[] args) {

        // Define an array
        int[] myArray = {1,2,3,4,5};
        int[] x = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        myArray[4] = 1;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

    }
}
