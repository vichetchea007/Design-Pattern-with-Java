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
public class BirdFactory extends AbstractFactory {

    public Bird getBird(BirdType type) {
        
        switch (type) {
            case CHICKEN:
                return new Chicken("Chicken");
            case DUCK:
                return new Duck("Duck");
            default:
                return null;
        }

    }
    

    @Override
    public Instrument getInstrument(InstrumentType type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
