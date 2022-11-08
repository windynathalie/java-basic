package nomortiga;

import java.util.Arrays;
import java.util.Scanner;

public class NomorTiga {
    public static void main(String[] args) throws Exception {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in Array: ");
        n = sc.nextInt();

        int[] array1 = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                int temp = 0;
                if (array1[j] < array1[i]) {

                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array1));
    }
}
