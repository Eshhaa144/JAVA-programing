import java.util.Scanner;
import java.util.Arrays;

public class ArrayIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("The array elements are: " + Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Enter the max index:  ");
        int max = sc.nextInt();
        System.out.print("Enter the min index:  ");
        int min = sc.nextInt();
        // System.out.println("The array elements are: " + Arrays.toString(array));
        sc.close();
        System.out.println("the " + (max) + " largest element is: " + array[max-1]);
        System.out.println("the " + (min) + " smallest element is: " + array[min-1]);

    }
}
