package tugas4;

import java.util.Scanner;

import tugas4.abstractclass.BangunDatar;
import tugas4.abstractclass.BangunRuang;

public class Main {
    Scanner sc = new Scanner(System.in);
    String choose;
    int sisi, alas, tinggi, samping;
    int r;
    int tinggiPrisma;

    public void menu() {
        System.out.println("Menu =====================================");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        System.out.println("==========================================");
        System.out.print("Pilih Menu: ");
        choose = sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void bangunDatar() {
        System.out.println("List Bangun Datar ========================");
        System.out.println("1. Segitiga");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi");
        System.out.println("==========================================");
        System.out.print("Pilih Bangun Datar: ");
        choose = sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void bangunRuang() {
        System.out.println("List Bangun Ruang ========================");
        System.out.println("1. Prisma");
        System.out.println("2. Bola");
        System.out.println("3. Kubus");
        System.out.println("==========================================");
        System.out.print("Pilih Bangun Ruang: ");
        choose = sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Main main = new Main();
        boolean state = true;
        BangunDatar bangunDatarSegitiga = new Segitiga();
        BangunDatar bangunDatarLingkaran = new Lingkaran();
        BangunDatar bangunDatarPersegi = new Persegi();
        BangunRuang bangunRuangPrisma = new Prisma();
        BangunRuang bangunRuangBola = new Bola();
        BangunRuang bangunRuangKubus = new Kubus();

        do {
            main.menu();
            switch (main.choose) {
                case "1":
                    main.bangunDatar();
                    switch (main.choose) {
                        case "1":
                            bangunDatarSegitiga.bentuk();
                            bangunDatarSegitiga.karakteristik();

                            System.out.print("Nilai alas: ");
                            main.alas = main.sc.nextInt();
                            System.out.print("Nilai tinggi: ");
                            main.tinggi = main.sc.nextInt();
                            main.sc.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            bangunDatarSegitiga = new Segitiga(main.alas, main.tinggi);
                            bangunDatarSegitiga.print();
                            break;

                        case "2":
                            bangunDatarLingkaran.bentuk();
                            bangunDatarLingkaran.karakteristik();

                            System.out.print("Nilai jari-jari: ");
                            main.r = main.sc.nextInt();
                            main.sc.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            bangunDatarLingkaran = new Lingkaran(main.r);
                            bangunDatarLingkaran.print();
                            break;

                        case "3":
                            bangunDatarPersegi.bentuk();
                            bangunDatarPersegi.karakteristik();

                            System.out.print("Nilai sisi: ");
                            main.sisi = main.sc.nextInt();
                            main.sc.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            bangunDatarPersegi = new Persegi(main.sisi);
                            bangunDatarPersegi.print();
                            break;
                        default:
                            System.out.println("Inputan kamu tidak ada dalam daftar bangun datar!");
                            break;
                    }
                    break;

                case "2":
                    main.bangunRuang();
                    switch (main.choose) {
                        case "1":
                            bangunRuangPrisma.bentuk();
                            bangunRuangPrisma.karakteristik();

                            System.out.print("Nilai alas: ");
                            main.alas = main.sc.nextInt();
                            System.out.print("Nilai tinggi: ");
                            main.tinggi = main.sc.nextInt();
                            System.out.print("Nilai tinggi prisma: ");
                            main.tinggiPrisma = main.sc.nextInt();
                            main.sc.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            bangunRuangPrisma = new Prisma(main.alas, main.tinggi, main.tinggiPrisma);
                            bangunRuangPrisma.print();
                            break;

                        case "2":
                            bangunRuangBola.bentuk();
                            bangunRuangBola.karakteristik();

                            System.out.print("Nilai jari-jari: ");
                            main.r = main.sc.nextInt();
                            main.sc.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            bangunRuangBola = new Bola(main.r);
                            bangunRuangBola.print();
                            break;

                        case "3":
                            bangunRuangKubus.bentuk();
                            bangunRuangKubus.karakteristik();

                            System.out.print("Nilai sisi: ");
                            main.sisi = main.sc.nextInt();
                            main.sc.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            bangunRuangKubus = new Kubus(main.sisi);
                            bangunRuangKubus.print();
                            break;

                        default:
                            System.out.println("Inputan kamu tidak ada dalam daftar bangun ruang!");
                            break;
                    }
                    break;

                default:
                    System.out.println("Inputan kamu tidak ada dalam menu!");
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