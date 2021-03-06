package creational.ch4.builderpattern.meal;

import creational.ch4.builderpattern.meal.packing.Packing;

/**
 * @author vichet
 * @version 1.0
 * @created 03-Apr-2014 12:07:08 AM
 */
public interface Item {

    public String getName();

    public double getPrice();

    public Packing packing();

}
