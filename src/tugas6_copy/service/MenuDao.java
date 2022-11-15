package tugas6_copy.service;

public interface MenuDao<T, K> {
    void getFoods();

    void getDrinks();

    void getPackages();

    int getPrices(T data, K index);

    String getName(T data, K index);
}
