package creational.ch2.abstractfactory.cpufactory;

/**
 * @author vichet
 * @version 1.0
 * @created 21-Mar-2014 4:33:08 PM
 */
public class Client {

    public static void main(String[] args) {

        CPUFactory intelFactory = 
                FactoryProducer.getFactory(FactoryName.INTEL);
        
        Computer pc1 = new Computer(intelFactory);
        
        
        Computer pc2 = 
                new Computer(FactoryProducer.getFactory(FactoryName.AMD));
        
    }
}


