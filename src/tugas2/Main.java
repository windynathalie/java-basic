package tugas2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    String choose;
    String firstName, lastName, domicile;
    int birthYear, n;
    List<Education> lists = new ArrayList<Education>();

    List<String> schoolName = new ArrayList<String>(n);
    List<Integer> startYear = new ArrayList<Integer>(n);
    List<Integer> endYear = new ArrayList<Integer>(n);

    public void menu() {
        System.out.println("Menu =====================================");
        System.out.println("1. Input your Personal Data");
        System.out.println("2. Input your Background Education");
        System.out.println("3. Show your Personal Data");
        System.out.println("4. Show your Background Education");
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
                    System.out.println("Please Input your Personal Data!");
                    System.out.print("\nInput your First Name: ");
                    main.firstName = main.sc.nextLine();
                    System.out.print("\nInput your Last Name: ");
                    main.lastName = main.sc.nextLine();
                    System.out.print("\nInput your Domicile: ");
                    main.domicile = main.sc.nextLine();

                    System.out.print("\nInput your Birth of Year: ");
                    main.birthYear = main.sc.nextInt();
                    main.sc.nextLine();
                    while (!Pattern.compile("^(?:19|20)\\d{2}$").matcher(Integer.toString(main.birthYear)).matches()) {
                        System.out.println("\nPlease enter correct year (YYYY)!");
                        System.out.print("\nInput your Birth of Year: ");
                        main.birthYear = main.sc.nextInt();
                        main.sc.nextLine();
                        Pattern.compile("^(?:19|20)\\d{2}$").matcher(Integer.toString(main.birthYear));
                    }
                    System.out.print("Your personal data successfully added!\n");
                    break;

                case "2":

                    System.out.println("\nPlease Input your Educational Background!");
                    System.out.print("Enter the number of education you want to input: ");
                    main.n = main.sc.nextInt();
                    main.sc.nextLine();

                    for (int i = 1; i <= main.n; i++) {
                        System.out.println("\nInput Educational Data " + i);
                        System.out.print("Enter your school/university name: ");
                        main.schoolName.add(main.sc.nextLine());
                        System.out.print("Enter when your school year starts: ");
                        main.startYear.add(main.sc.nextInt());
                        System.out.print("Enter when your school year ends: ");
                        main.endYear.add(main.sc.nextInt());
                        main.sc.nextLine();
                    }
                    System.out.print("Your educational data successfully added!\n");

                    for (int i = 0; i < main.n; i++) {
                        Education education = new Education(main.schoolName.get(i), main.startYear.get(i),
                                main.endYear.get(i));
                        main.lists.add(education);
                    }
                    break;

                case "3":
                    System.out.println("\nBelow is your Personal Data...");
                    if (main.firstName == null || main.lastName == null || main.domicile == null) {
                        System.out.println("Oops, your data is empty! Please input your personal data using menu 1!");
                    } else {
                        Person person = new Person(main.firstName, main.lastName, main.domicile, main.birthYear);
                        person.getPerson();
                    }

                    break;

                case "4":
                    System.out.println("\nBelow is your Educational Background...");
                    if (main.lists.isEmpty()) {
                        System.out
                                .println("Oops, your data is empty! Please input your educational data using menu 2!");
                    } else {
                        for (int i = 0; i < main.n; i++) {
                            main.lists.get(i).getEducation();
                        }
                    }
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

        System.out.println("Log out.. See you next time!");
    }
}
