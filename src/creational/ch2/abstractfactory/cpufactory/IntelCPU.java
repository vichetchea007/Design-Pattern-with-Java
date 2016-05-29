package creational.ch2.abstractfactory.cpufactory;

/**
 * @author vichet
 * @version 1.0
 * @created 21-Mar-2014 4:33:07 PM
 */
public class IntelCPU implements CPU {

    @Override
    public void process() {
        System.out.println("Intel CPU is processing...");
    }
}

