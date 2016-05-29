package creational.ch4.builderpattern.meal;

/**
 * @author vichet
 * @version 1.0
 * @created 03-Apr-2014 12:07:08 AM
 */
public class MealBuilder {

    public Meal preparedNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurgger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurgger());
        meal.addItem(new Coke());
        return meal;
    }
}
