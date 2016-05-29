package creational.ch2.abstractfactory.cpufactory;

/**
 * @author vichet
 * @version 1.0
 * @created 21-Mar-2014 4:33:08 PM
 */
public class Computer {

    private final CPU cpu;
    
    public Computer(CPUFactory cpuFactory) {
        System.out.println("Computer is booting up...");
        this.cpu = cpuFactory.produceCPU();
        this.cpu.process();
    }
    
    
}


