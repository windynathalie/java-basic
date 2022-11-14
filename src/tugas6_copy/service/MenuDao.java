package tugas6_copy.service;

public interface MenuDao<K> {
    void getFoods();

    void getDrinks();

    void getPackages();

    int getDrinkPrices(K index);

    int getFoodPrices(K index);

    int getPackagePrices(K index);

    String getDrinkName(K index);

    String getFoodName(K index);

    String getPackageName(K index);
}
