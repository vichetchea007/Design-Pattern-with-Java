package creational.ch2.abstractfactory.cpufactory;

/**
 * @author vichet
 * @version 1.0
 * @created 21-Mar-2014 4:33:07 PM
 */
public class AMDCPU implements CPU {

    @Override
    public void process() {
        System.out.println("AMD CPU is processing...");
    }
}

