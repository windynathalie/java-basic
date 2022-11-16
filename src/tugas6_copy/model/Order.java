package tugas6_copy.model;

public class Order {
    private int index;
    private int orders;
    private int types;

    public Order() {

    }

    public Order(int index, int orders, int types) {
        this.index = index;
        this.orders = orders;
        this.types = types;
    }

    public int getTypes() {
        return types;
    }

    public void setTypes(int types) {
        this.types = types;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }
}
