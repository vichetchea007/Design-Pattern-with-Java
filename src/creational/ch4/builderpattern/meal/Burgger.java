package creational.ch4.builderpattern.meal;

import creational.ch4.builderpattern.meal.packing.Packing;
import creational.ch4.builderpattern.meal.packing.Wrapper;

/**
 * @author vichet
 * @version 1.0
 * @created 03-Apr-2014 12:07:07 AM
 */
public abstract class Burgger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract String getName();

    public abstract double getPrice();
}

