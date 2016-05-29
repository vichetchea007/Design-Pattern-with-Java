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
public class InstrumentFactory extends AbstractFactory {

    @Override
    public Bird getBird(BirdType type) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
    public Instrument getInstrument(InstrumentType type) {
        
        switch (type) {
            case DRUM:
                return new Drum("Drum");
            case GUITA:
                return new Guitar("GUITA");
            case FLUTE:
                return new Flute("Flute");
            default:
                return null;
        }        
    }
}
