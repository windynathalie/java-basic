package nomordua;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NomorDua {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Integer> inputArray() {
        int n;

        System.out.print("Enter the number of elements you want to store in Array: ");
        n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(n);

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        return (numbers);
    }

    public static void main(String[] args) throws Exception {
        NomorDua nomorDua = new NomorDua();
        ArrayList<Integer> array1 = nomorDua.inputArray();
        System.out.println(array1);

        System.out.println();

        ArrayList<Integer> array2 = nomorDua.inputArray();
        System.out.println(array2);

        HashSet<Integer> commonValue = new HashSet<>();
        System.out.println("The same value between the two arrays are:");

        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j)) {
                    commonValue.add(array1.get(i));
                }
            }
        }
        System.out.println(commonValue);
    }
}
