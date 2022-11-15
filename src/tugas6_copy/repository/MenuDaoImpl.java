package tugas6_copy.repository;

import java.util.ArrayList;
import java.util.List;

import tugas6_copy.model.Menu;
import tugas6_copy.service.MenuDao;

public class MenuDaoImpl implements MenuDao<List<Menu>, Integer> {
    private Menu menu = new Menu();

    List<Menu> foods;
    List<Menu> drinks;
    List<Menu> packages;

    public MenuDaoImpl() {
        foods = new ArrayList<Menu>();
        foods.add(new Menu(1, "Cake", 10000));
        foods.add(new Menu(2, "Chicken", 20000));
        foods.add(new Menu(3, "Fish", 10000));
        foods.add(new Menu(4, "Rice", 5000));
        foods.add(new Menu(5, "Ice Cream", 8000));
        foods.add(new Menu(6, "Shrimp", 30000));
        foods.add(new Menu(7, "Satay", 20000));

        drinks = new ArrayList<Menu>();
        drinks.add(new Menu(1, "Mineral Water", 5000));
        drinks.add(new Menu(2, "Lemon Juice", 10000));
        drinks.add(new Menu(3, "Avocado Juice", 12000));
        drinks.add(new Menu(4, "Watermelon Juice", 5000));
        drinks.add(new Menu(5, "Melon Juice", 8000));
        drinks.add(new Menu(6, "Milkshake", 30000));
        drinks.add(new Menu(7, "Tea", 8000));

        packages = new ArrayList<Menu>();
        packages.add(new Menu(1, "Package A (Rice + Fish + Mineral Water)", 30000));
        packages.add(new Menu(2, "Package B (Rice + Chicken + Mineral Water)", 40000));
        packages.add(new Menu(3, "Package C (Rice + Shrimp + Mineral Water)", 50000));
    }

    @Override
    public void getFoods() {
        System.out.println("\nFoods");
        System.out.println("==========================================");
        for (Menu food : foods) {
            System.out.println(
                    food.getIndex() + ". " + food.getName() + "\n" + "Price: Rp. " + food.getPrice());
        }
    }

    @Override
    public void getDrinks() {
        System.out.println("\nDrinks");
        System.out.println("==========================================");
        for (Menu drink : drinks) {
            System.out.println(
                    drink.getIndex() + ". " + drink.getName() + "\n" + "Price: Rp. " + drink.getPrice());
        }
    }

    @Override
    public void getPackages() {
        System.out.println("\nPackages");
        System.out.println("==========================================");
        for (Menu packages : packages) {
            System.out.println(
                    packages.getIndex() + ". " + packages.getName() + "\n" + "Price: Rp. " + packages.getPrice());
        }
    }

    @Override
    public int getPrices(List<Menu> data, Integer index) {
        menu = data.get(index);
        return menu.getPrice();
    }

    @Override
    public String getName(List<Menu> data, Integer index) {
        menu = data.get(index);
        return menu.getName();
    }
}
