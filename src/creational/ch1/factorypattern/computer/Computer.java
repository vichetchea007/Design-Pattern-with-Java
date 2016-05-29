package creational.ch1.factorypattern.computer;

/**
 * @author vichet
 * @version 1.0
 * @created 14-Feb-2014 10:12:05 AM
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "Computer{RAM: " + this.getRAM()
                + ", HDD: " + this.getHDD()
                + ", CPU: " + this.getCPU() + "}";
    }

}//end Computer
