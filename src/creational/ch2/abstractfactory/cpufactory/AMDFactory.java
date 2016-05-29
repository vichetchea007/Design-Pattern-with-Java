package creational.ch2.abstractfactory.cpufactory;

/**
 * @author vichet
 * @version 1.0
 * @created 21-Mar-2014 4:33:08 PM
 */
public class AMDFactory implements CPUFactory {

    @Override
    public CPU produceCPU() {
        return new AMDCPU();
    }
}

