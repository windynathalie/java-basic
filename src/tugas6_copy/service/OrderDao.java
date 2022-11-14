package tugas6_copy.service;

import java.util.List;

public interface OrderDao<K> {
    void order(List<K> index, List<K> orders, List<K> type);

    void getOrders();

    void editOrders(K index, K amount);

    void deleteOrders(K index);

    int getTotalOrder();

    int getTotalOrderPPN();

    int getPPN();

    void payment(K amount);
}
