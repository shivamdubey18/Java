import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create an array of the given size
        int[] numbers = new int[size];

        // Step 3: Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Print the array elements
        System.out.print("Array elements are: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
