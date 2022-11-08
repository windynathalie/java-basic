package nomorsatu;

import java.util.Scanner;

public class NomorSatu {
    Scanner sc = new Scanner(System.in);

    public void print() {
        System.out.println("-------- BIODATA --------");
        System.out.println("Input nama depan: ");
        String firstName = sc.nextLine();
        System.out.println("Input nama belakang: ");
        String lastName = sc.nextLine();
        System.out.println("Input birthplace: ");
        String birthPlace = sc.nextLine();
        System.out.println("Input birthYear: ");
        String birthYear = sc.nextLine();
        System.out.println("Input progLangFav: ");
        String progLangFav = sc.nextLine();

        System.out.println();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Place: " + birthPlace);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Program Language Favorite: " + progLangFav);
    }

    public static void main(String[] args) throws Exception {
        NomorSatu nomorsatu = new NomorSatu();
        nomorsatu.print();
    }
}
