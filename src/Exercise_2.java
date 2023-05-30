public class Exercise_2 {
    static void main(String[] args) {
        int[] oddNumbers = new int[50];

        int number = 1;
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = number;
            number += 2;
        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}
