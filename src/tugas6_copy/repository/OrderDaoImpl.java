package tugas6_copy.repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import tugas6_copy.model.Order;
import tugas6_copy.service.OrderDao;

public class OrderDaoImpl implements OrderDao<Integer> {
    private Order order = new Order();
    private MenuDaoImpl menudao = new MenuDaoImpl();

    List<Order> listofOrder = new ArrayList<Order>();
    List<Integer> totalOrder = new ArrayList<Integer>();

    int sum;

    @Override
    public void order(List<Integer> index, List<Integer> orders, List<Integer> type) {
        for (int i = 0; i < index.size(); i++) {
            if (type.get(i) == 1) {
                if (index.get(i) <= menudao.foods.size() && index.get(i) > 0) {
                    listofOrder.add(new Order(index.get(i), orders.get(i), type.get(i)));
                }
            } else if (type.get(i) == 2) {
                if (index.get(i) <= menudao.drinks.size() && index.get(i) > 0) {
                    listofOrder.add(new Order(index.get(i), orders.get(i), type.get(i)));
                }
            } else if (type.get(i) == 3) {
                if (index.get(i) <= menudao.packages.size() && index.get(i) > 0) {
                    listofOrder.add(new Order(index.get(i), orders.get(i), type.get(i)));
                }
            }
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
    public int getPPN() {
        return (sum * 11 / 100);
    }

    @Override
    public int getTotalOrderPPN() {
        return (sum + getPPN());
    }

    @Override
    public void getOrders() {
        System.out.println("\nYour order: ");
        for (int i = 0; i < listofOrder.size(); i++) {
            order = listofOrder.get(i);
            if (order.getTypes() == 1) {
                totalOrder.add((order.getOrders()) * menudao.getPrices(menudao.foods, order.getIndex() - 1));
                System.out.println((i + 1) + ". " + menudao.getName(menudao.foods, order.getIndex() - 1));
                System.out.println(
                        (order.getOrders()) + " x Rp. " + menudao.getPrices(menudao.foods, order.getIndex() - 1)
                                + ": Rp. "
                                + ((order.getOrders()) * menudao.getPrices(menudao.foods, order.getIndex() - 1)));
            } else if (order.getTypes() == 2) {
                totalOrder.add((order.getOrders()) * menudao.getPrices(menudao.drinks, order.getIndex() - 1));
                System.out.println((i + 1) + ". " + menudao.getName(menudao.drinks, order.getIndex() - 1));
                System.out.println(
                        (order.getOrders()) + " x Rp. " + menudao.getPrices(menudao.drinks, order.getIndex() - 1)
                                + ": Rp. "
                                + ((order.getOrders()) * menudao.getPrices(menudao.drinks, order.getIndex() - 1)));
            } else if (order.getTypes() == 3) {
                totalOrder.add((order.getOrders()) * menudao.getPrices(menudao.packages, order.getIndex() - 1));
                System.out.println((i + 1) + ". " + menudao.getName(menudao.packages, order.getIndex() - 1));
                System.out.println(
                        (order.getOrders()) + " x Rp. " + menudao.getPrices(menudao.packages, order.getIndex() - 1)
                                + ": Rp. "
                                + ((order.getOrders()) * menudao.getPrices(menudao.packages, order.getIndex() - 1)));
            }
        }
        System.out.println("\nTotal Order: Rp. " + getTotalOrder());
        System.out.println("Total Order with PPN (11%): Rp. " + getTotalOrderPPN());
    }

    @Override
    public void editOrders(Integer index, Integer amount) {
        if (listofOrder.isEmpty() || index + 1 > listofOrder.size() || index + 1 <= 0) {
            System.out.println("\nNothing to edit!!!");
        } else {
            order = listofOrder.get(index);
            order.setOrders(amount);
            System.out.println("\nSuccessfully edit your data!");
            getOrders();
        }
    }

    @Override
    public void deleteOrders(Integer index) {
        if (listofOrder.isEmpty() || index + 1 > listofOrder.size() || index + 1 <= 0) {
            System.out.println("\nNothing to delete!!!");
        } else {
            listofOrder.remove((int) index);
            System.out.println("\nSuccessfully delete your data!");
            getOrders();
        }
    }

    @Override
    public void payment(Integer amount) {
        System.out.println("\nPayment Receipt");
        System.out.println("==========================================");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd MMMM yyyy, HH:mm:ss");
        String dateTimeFormatted = dateTimeNow.format(formatter);
        System.out.println(dateTimeFormatted);
        getOrders();
        System.out.println("Total PPN (11%): Rp. " + getPPN());
        System.out.println("==========================================");
        System.out.println("\nYour Money: Rp. " + amount);
        System.out.println("Your Change: Rp. " + (amount - getTotalOrderPPN()));
        System.out
                .println("\nThanks for your order! We will be very\ngrateful if you come and order\nagain next time ~");
        System.out.println("\nHave a nice day :)");
        listofOrder.clear();
    }
}
