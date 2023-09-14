import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a counting array with a size one greater than the maximum element
        int[] countArray = new int[max + 1];

        // Count the occurrences of each element in the input array
        for (int i = 0; i < n; i++) {
            countArray[arr[i]]++;
        }

        // Reconstruct the sorted array
        int sortedIndex = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[sortedIndex++] = i;
                countArray[i]--;
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
