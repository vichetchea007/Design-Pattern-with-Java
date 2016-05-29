package creational.ch4.builderpattern.meal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vichet
 * @version 1.0
 * @created 03-Apr-2014 12:07:08 AM
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double getCost() {
        double cost = 0.0;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.getName());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.getPrice());
        }
    }
}
