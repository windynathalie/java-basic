package nomordua;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NomorDua {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in Array 1: ");
        n = sc.nextInt();

        int[] array1 = new int[n];
        System.out.println("Enter the elements of the array 1: ");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        System.out.print("Enter the number of elements you want to store in Array 2: ");
        n = sc.nextInt();
        int[] array2 = new int[n];
        System.out.println("Enter the elements of the array 2: ");
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        sc.close();

        HashSet<Integer> commonValue = new HashSet<>();
        System.out.println("The same value between the two arrays are:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonValue.add(array1[i]);
                }
            }
        }
        System.out.println(commonValue);
    }
}
