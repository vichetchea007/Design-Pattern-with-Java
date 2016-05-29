package creational.ch4.builderpattern.meal;

import creational.ch4.builderpattern.meal.packing.Bottle;
import creational.ch4.builderpattern.meal.packing.Packing;

/**
 * @author vichet
 * @version 1.0
 * @created 03-Apr-2014 12:07:08 AM
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract String getName();
    public abstract double getPrice();
}
