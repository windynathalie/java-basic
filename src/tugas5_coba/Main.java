package tugas5_coba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tugas5_coba.interfaceclass.StudentInterface;

public class Main {
    Scanner sc = new Scanner(System.in);
    String fullName, domicile, identityCard;
    String choose;
    String edit, newName;
    int numberOfCourses;
    List<String> courseName = new ArrayList<String>(numberOfCourses);
    List<String> courseRoom = new ArrayList<String>(numberOfCourses);
    List<Integer> courseCredits = new ArrayList<Integer>(numberOfCourses);

    public void menu() {
        System.out.println("==========================================");
        System.out.println("Menu:");
        System.out.println("1. Personal Information");
        System.out.println("2. Input Course");
        System.out.println("3. Edit Course");
        System.out.println("4. Delete Course");
        System.out.println("5. Course Summary");
        System.out.println("==========================================\n");
        System.out.print("Choose Menu: ");
        choose = sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void course() {
        System.out.println("==========================================");
        System.out.println("Input your course");
        System.out.println("==========================================\n");
        System.out.print("How many course do you want to input? ");
        numberOfCourses = sc.nextInt();
        sc.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        boolean state = true;
        StudentInterface studentInterface;
        System.out.println("==========================================");
        System.out.println("Welcome to Student Credits Data Center");
        System.out.println("==========================================\n");
        System.out.print("Input your Full Name: ");
        main.fullName = main.sc.nextLine();
        System.out.print("Input your Domicile: ");
        main.domicile = main.sc.nextLine();
        System.out.print("Input your Identity Card: ");
        main.identityCard = main.sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        studentInterface = new Student(main.fullName, main.domicile, main.identityCard);
        studentInterface.studentRegistration(main.fullName, main.identityCard);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {
            main.menu();
            switch (main.choose) {
                case "1":
                    do {
                        studentInterface.print();
                        System.out.print("\nDo you want to edit your domicile? (y|n)? ");
                        main.choose = main.sc.nextLine();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        while (!main.choose.equalsIgnoreCase("y") && !main.choose.equalsIgnoreCase("n")) {
                            System.out.println("Wrong input! Please choose between (y/n)!");
                            System.out.print("\nDo you want to edit your domicile? (y|n)? ");
                            main.choose = main.sc.nextLine();
                        }

                        if (main.choose.equalsIgnoreCase("n")) {
                            state = false;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        } else if (main.choose.equalsIgnoreCase("y")) {
                            state = true;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.print("Input your Domicile: ");
                            main.domicile = main.sc.nextLine();
                            studentInterface = new Student(main.fullName, main.domicile, main.identityCard);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    } while (state);
                    break;

                case "2":
                    main.course();
                    for (int i = 1; i <= main.numberOfCourses; i++) {
                        System.out.println("\nInput Course " + i);
                        do {
                            System.out.print("Enter course name that you want to take: ");
                            main.edit = main.sc.nextLine().toLowerCase();
                            if (main.courseName.contains(main.edit)) {
                                System.out.println("You have taken this course! Please input other courses...");
                                state = true;
                            } else {
                                String words[] = main.edit.split("\\s");
                                String capitalizeStr = "";

                                for (int j = 0; j < words.length; j++) {
                                    // Capitalize first letter
                                    String firstLetter = words[j].substring(0, 1);
                                    // Get remaining letter
                                    String remainingLetters = words[j].substring(1);
                                    if (j == (words.length - 1)) {
                                        capitalizeStr += firstLetter.toUpperCase();
                                    } else {
                                        capitalizeStr += firstLetter.toUpperCase() + remainingLetters + " ";
                                    }
                                }
                                main.courseName.add(capitalizeStr);
                                state = false;
                            }
                        } while (state);
                        System.out.print("Enter course credits: ");
                        main.courseCredits.add(main.sc.nextInt());
                        main.sc.nextLine();
                        System.out.print("Enter course room: ");
                        main.courseRoom.add(main.sc.nextLine());
                        System.out.println(main.courseName);
                    }
                    studentInterface.learningPlan(main.courseName, main.courseCredits, main.courseRoom);
                    break;

                case "3":
                    do {
                        System.out.print("Enter course name that you want to edit: ");
                        main.edit = main.sc.nextLine();
                        System.out.println(main.courseName.indexOf(main.edit));

                        System.out.print("Enter new name of course: ");
                        main.newName = main.sc.nextLine();
                        main.courseName.set(main.courseName.indexOf(main.edit), main.newName);
                        System.out.print("Enter credits of course: ");
                        main.courseCredits.set(main.courseName.indexOf(main.newName), main.sc.nextInt());
                        main.sc.nextLine();
                        System.out.print("Enter room of course: ");
                        main.courseRoom.set(main.courseName.indexOf(main.newName), main.sc.nextLine());
                        studentInterface.learningPlan(main.courseName, main.courseCredits, main.courseRoom);

                        System.out.print("Do you want to edit again?  (y/n)? ");
                        main.choose = main.sc.nextLine();

                        if (main.choose.equalsIgnoreCase("n")) {
                            state = false;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        } else if (main.choose.equalsIgnoreCase("y")) {
                            state = true;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    } while (state);
                    break;

                case "4":
                    do {
                        System.out.print("Enter course name that you want to delete: ");
                        main.edit = main.sc.nextLine();
                        main.courseCredits.remove(main.courseName.indexOf(main.edit));
                        main.courseRoom.remove(main.courseName.indexOf(main.edit));
                        main.courseName.remove(main.courseName.indexOf(main.edit));

                        System.out.print("Do you want to delete again?  (y/n)? ");
                        main.choose = main.sc.nextLine();

                        if (main.choose.equalsIgnoreCase("n")) {
                            state = false;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        } else if (main.choose.equalsIgnoreCase("y")) {
                            state = true;
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }
                    } while (state);
                    break;

                case "5":
                    studentInterface.getSummary();
                    break;

                default:
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
        System.out.println("Thanks for using this application! Have a nice day :)");
    }

}
