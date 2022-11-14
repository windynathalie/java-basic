package tugas6_copy.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import tugas6_copy.model.Order;

public class OrderDaoImpl implements OrderDao<Integer> {
    private Order order = new Order();
    private MenuDaoImpl menudao = new MenuDaoImpl();

    List<Order> listofOrder = new ArrayList<Order>();
    List<Integer> totalOrder = new ArrayList<Integer>();

    int sum;

    @Override
    public void order(List<Integer> index, List<Integer> orders, List<Integer> type) {
        for (int i = 0; i < index.size(); i++) {
            listofOrder.add(new Order(index.get(i), orders.get(i), type.get(i)));
        }
    }

    @Override
    public int getTotalOrder() {
        sum = 0;
        for (Integer totalOrder : totalOrder) {
            sum += totalOrder;
        }
        totalOrder.clear();
        return sum;
    }

    @Override
    public int getTotalOrderPPN() {
        return (sum + (sum * 11 / 100));
    }

    @Override
    public int getPPN() {
        return (sum * 11 / 100);
    }

    @Override
    public void getOrders() {
        System.out.println("\nYour order: ");
        for (int i = 0; i < listofOrder.size(); i++) {
            order = listofOrder.get(i);
            if (order.getTypes() == 1) {
                totalOrder.add((order.getOrders()) * menudao.getFoodPrices(order.getIndex() - 1));
                System.out.println((i + 1) + ". " + menudao.getFoodName(order.getIndex() - 1));
                System.out.println(
                        (order.getOrders()) + "x " + menudao.getFoodPrices(order.getIndex() - 1) + ": "
                                + ((order.getOrders()) * menudao.getFoodPrices(order.getIndex() - 1)));
            } else if (order.getTypes() == 2) {
                totalOrder.add((order.getOrders()) * menudao.getDrinkPrices(order.getIndex() - 1));
                System.out.println((i + 1) + ". " + menudao.getDrinkName(order.getIndex() - 1));
                System.out.println(
                        (order.getOrders()) + "x " + menudao.getDrinkPrices(order.getIndex() - 1) + ": "
                                + ((order.getOrders()) * menudao.getDrinkPrices(order.getIndex() - 1)));
            } else if (order.getTypes() == 3) {
                totalOrder.add((order.getOrders()) * menudao.getPackagePrices(order.getIndex() - 1));
                System.out.println((i + 1) + ". " + menudao.getPackageName(order.getIndex() - 1));
                System.out.println(
                        (order.getOrders()) + "x " + menudao.getPackagePrices(order.getIndex() - 1) + ": "
                                + ((order.getOrders()) * menudao.getPackagePrices(order.getIndex() - 1)));
            }
        }
        System.out.println("\nTotal Order: " + getTotalOrder());
        System.out.println("Total Order with PPN (11%): " + getTotalOrderPPN());
    }

    @Override
    public void editOrders(Integer index, Integer amount) {
        order = listofOrder.get(index);
        order.setOrders(amount);
        System.out.println("\nSuccessfully edit your data!");
    }

    @Override
    public void deleteOrders(Integer index) {
        listofOrder.remove((int) index);
        System.out.println("\nSuccessfully delete your data!");
    }

    @Override
    public void payment(Integer amount) {
        System.out.println("\nPayment Receipt");
        System.out.println("==========================================");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMMM dd yyyy, HH:mm:ss");
        String dateTimeFormatted = dateTimeNow.format(formatter);
        System.out.println(dateTimeFormatted);
        getOrders();
        System.out.println("Total PPN (11%): " + getPPN());
        System.out.println("==========================================");
        System.out.println("\nYour Money: " + amount);
        System.out.println("Your Change: " + (amount - getTotalOrderPPN()));
        System.out
                .println("\nThanks for your order! We will be very\ngrateful if you come and order\nagain next time ~");
        System.out.println("\nHave a nice day :)");
        listofOrder.clear();
    }
}
