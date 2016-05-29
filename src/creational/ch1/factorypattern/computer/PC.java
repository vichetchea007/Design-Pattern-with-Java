package creational.ch1.factorypattern.computer;

/**
 * @author vichet
 * @version 1.0
 * @created 14-Feb-2014 10:46:55 AM
 */
public class PC extends Computer {

    private String RAM;
    private String HDD;
    private String CPU;

    public PC(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    @Override
    public String toString() {
        return "PC{" + "RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + '}';
    }

    
    
}//end PC
