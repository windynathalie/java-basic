package tugas3;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    String choose;
    int sisi, alas, tinggi;
    int r;
    int tinggiPrisma;

    public void menu() {
        System.out.println("Menu =====================================");
        System.out.println("1. Segitiga");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi");
        System.out.println("4. Prisma");
        System.out.println("5. Bola");
        System.out.println("6. Kubus");
        System.out.println("==========================================");
        System.out.print("Choose Menu: ");
        choose = sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Main main = new Main();
        boolean state = true;

        do {
            main.menu();
            switch (main.choose) {
                case "1":
                    System.out.print("Nilai alas: ");
                    main.alas = main.sc.nextInt();
                    System.out.print("Nilai tinggi: ");
                    main.tinggi = main.sc.nextInt();
                    main.sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Segitiga segitiga = new Segitiga(main.alas, main.tinggi);
                    segitiga.getSegitiga();
                    break;

                case "2":
                    System.out.print("Nilai jari-jari: ");
                    main.r = main.sc.nextInt();
                    main.sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Lingkaran lingkaran = new Lingkaran(main.r);
                    lingkaran.getLingkaran();
                    break;

                case "3":
                    System.out.print("Nilai sisi: ");
                    main.sisi = main.sc.nextInt();
                    main.sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Persegi persegi = new Persegi(main.sisi);
                    persegi.getPersegi();
                    break;

                case "4":
                    System.out.print("Nilai alas: ");
                    main.alas = main.sc.nextInt();
                    System.out.print("Nilai tinggi: ");
                    main.tinggi = main.sc.nextInt();
                    System.out.print("Nilai tinggi prisma: ");
                    main.tinggiPrisma = main.sc.nextInt();
                    main.sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Prisma prisma = new Prisma(main.alas, main.tinggi, main.tinggiPrisma);
                    prisma.getPrisma();
                    break;

                case "5":
                    System.out.print("Nilai jari-jari: ");
                    main.r = main.sc.nextInt();
                    main.sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Bola bola = new Bola(main.r);
                    bola.getBola();
                    break;

                case "6":
                    System.out.print("Nilai sisi: ");
                    main.sisi = main.sc.nextInt();
                    main.sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Kubus kubus = new Kubus(main.sisi);
                    kubus.getKubus();
                    break;

                default:
                    System.out.println("Your input is not in accordance with the menu!");
                    break;
            }
            System.out.print("\nDo you want to exit program? (y|n)? ");
            main.choose = main.sc.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            while (!main.choose.equalsIgnoreCase("y") && !main.choose.equalsIgnoreCase("n")) {
                System.out.println("Wrong input! Please choose between (y/n)!");
                System.out.print("Do you want to exit program?  (y/n)? ");
                main.choose = main.sc.nextLine();
            }

            if (main.choose.equalsIgnoreCase("n")) {
                state = true;
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else if (main.choose.equalsIgnoreCase("y")) {
                state = false;
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } while (state);
        System.out.println("Thanks for using this calculator!");
    }
}