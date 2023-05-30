import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("The sum of array elements: " + sum);
    }
}
