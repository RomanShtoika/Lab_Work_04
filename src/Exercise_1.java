public class Exercise_1 {
    public static void main(String[] args) {
        int[] evenNumbers = new int[50];

        int number = 0;
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = number;
            number += 2;
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
