package tugas6_copy.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tugas6_copy.model.Menu;
import tugas6_copy.repository.MenuDaoImpl;
import tugas6_copy.repository.OrderDaoImpl;
import tugas6_copy.service.MenuDao;
import tugas6_copy.service.OrderDao;

public class CashierController {
    static Scanner sc = new Scanner(System.in);
    static String choose;
    static boolean state = true;
    static int total;
    static int index, amount;

    static List<Integer> number = new ArrayList<Integer>(total);
    static List<Integer> orders = new ArrayList<Integer>(total);
    static List<Integer> types = new ArrayList<Integer>(total);

    static MenuDao<List<Menu>, Integer> menu = new MenuDaoImpl();
    static OrderDao<Integer> order = new OrderDaoImpl();

    static void menu() {
        System.out.println("==========================================");
        System.out.println("Welcome to XXX Restaurant");
        System.out.println("==========================================");
        System.out.println("1. List of Menu");
        System.out.println("2. Input Order");
        System.out.println("3. Edit Order");
        System.out.println("4. Remove Order");
        System.out.println("5. Pay your Order");
        System.out.println("==========================================\n");
        System.out.print("Choose Menu: ");
        choose = sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void orders() {
        order.order(number, orders, types);
        number.clear();
        orders.clear();
        types.clear();
        order.getOrders();
    }

    public static void main(String[] args) {

        do {
            menu();

            switch (choose) {
                case "1":
                    menu.getFoods();
                    menu.getDrinks();
                    menu.getPackages();
                    break;

                case "2":
                    System.out.println("Input Order");
                    System.out.println("==========================================");
                    System.out.println("1. Foods");
                    System.out.println("2. Drinks");
                    System.out.println("3. Packages");
                    System.out.println("==========================================\n");
                    System.out.print("What do you want to order? ");
                    choose = sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    switch (choose) {
                        case "1":
                            menu.getFoods();
                            System.out.print("\nHow many food do you want to order? ");
                            total = sc.nextInt();
                            System.out.println("==========================================");
                            for (int i = 1; i <= total; i++) {
                                System.out.println("\nInput Menu " + i);
                                System.out.print("Input number of your selected food: ");
                                number.add(sc.nextInt());
                                System.out.print("Input total orders of your selected food: ");
                                orders.add(sc.nextInt());
                                sc.nextLine();
                                types.add(1);
                            }
                            orders();
                            break;

                        case "2":
                            menu.getDrinks();
                            System.out.print("\nHow many drink do you want to order? ");
                            total = sc.nextInt();
                            System.out.println("==========================================");
                            for (int i = 1; i <= total; i++) {
                                System.out.println("\nInput Menu " + i);
                                System.out.print("Input number of your selected drink: ");
                                number.add(sc.nextInt());
                                System.out.print("Input total orders of your selected drink: ");
                                orders.add(sc.nextInt());
                                sc.nextLine();
                                types.add(2);
                            }
                            orders();
                            break;

                        case "3":
                            menu.getPackages();
                            System.out.print("\nHow many package do you want to order? ");
                            total = sc.nextInt();
                            System.out.println("==========================================");
                            for (int i = 1; i <= total; i++) {
                                System.out.println("\nInput Menu " + i);
                                System.out.print("Input number of your selected package: ");
                                number.add(sc.nextInt());
                                System.out.print("Input total orders of your selected package: ");
                                orders.add(sc.nextInt());
                                sc.nextLine();
                                types.add(3);
                            }
                            orders();
                            break;

                        default:
                            System.out.println("Your input is not in the list! Choose between 1 - 3");
                            break;
                    }
                    break;

                case "3":
                    order.getOrders();
                    System.out.println("\nEdit your order");
                    System.out.println("==========================================");
                    System.out.print("Input number of menu that you want to edit: ");
                    index = sc.nextInt();
                    System.out.print("Input total orders of menu you've selected: ");
                    amount = sc.nextInt();
                    sc.nextLine();
                    order.editOrders(index - 1, amount);
                    break;

                case "4":
                    order.getOrders();
                    System.out.println("\nDelete your order");
                    System.out.println("==========================================");
                    System.out.print("Input number of menu that you want to delete: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    order.deleteOrders(index - 1);
                    break;

                case "5":
                    do {
                        System.out.println("\nPay your order");
                        System.out.println("==========================================");
                        order.getOrders();
                        System.out.println("\n==========================================\n");
                        System.out.print("Input your amount: Rp. ");
                        amount = sc.nextInt();
                        sc.nextLine();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if (amount < order.getTotalOrderPPN()) {
                            System.out.println("Your money is not enough!");
                            state = true;
                        } else {
                            order.payment(amount);
                            state = false;
                            number.clear();
                            orders.clear();
                            types.clear();
                        }
                    } while (state);
                    break;

                default:
                    break;
            }

            System.out.print("\nDo you want to exit program? (y|n)? ");
            choose = sc.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            while (!choose.equalsIgnoreCase("y") && !choose.equalsIgnoreCase("n")) {
                System.out.println("Wrong input! Please choose between (y/n)!");
                System.out.print("Do you want to exit program?  (y/n)? ");
                choose = sc.nextLine();
            }

            if (choose.equalsIgnoreCase("n")) {
                state = true;
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else if (choose.equalsIgnoreCase("y")) {
                state = false;
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } while (state);
        System.out.println("Thanks for using this application! Have a nice day :)");
    }
}
