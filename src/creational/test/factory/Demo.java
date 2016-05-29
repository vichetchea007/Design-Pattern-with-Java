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
public class Demo {
    
    public static void main(String[] args) {
        
        AbstractFactory instrumentFactory = FactoryProducer.getFactory(FactoryType.INSTRUMENT_FACTORY);
        AbstractFactory birdFactory = FactoryProducer.getFactory(FactoryType.BIRD_FACTORY);
        
        Bird duck = birdFactory.getBird(BirdType.DUCK);
        Bird chicken = birdFactory.getBird(BirdType.CHICKEN);
        
        Instrument drum = instrumentFactory.getInstrument(InstrumentType.DRUM);
        Instrument guita = instrumentFactory.getInstrument(InstrumentType.GUITA);
        
        duck.speak();
        chicken.speak();
        drum.speak();
        guita.speak();
        
        Instrument flute = instrumentFactory.getInstrument(InstrumentType.FLUTE);
        flute.speak();
        
    }
}
