/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.test.factory;

/**
 *
 * @author vichet
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case BIRD_FACTORY:
                return new BirdFactory();
            case INSTRUMENT_FACTORY:
                return new InstrumentFactory();
            default:
                return null;
        }
    }
}
