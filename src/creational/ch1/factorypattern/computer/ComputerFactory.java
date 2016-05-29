package creational.ch1.factorypattern.computer;

/**
 * @author vichet
 * @version 1.0
 * @created 14-Feb-2014 10:52:01 AM
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String RAM, String HDD, String CPU) {
        
        Computer computer;

        switch (type.toUpperCase()) {
            case "PC":
                computer = new PC(RAM, HDD, CPU);
                break;
            case "SERVER":
                computer = new Server(RAM, HDD, CPU);
                break;
            default:
                computer = null;
        }
        return computer;
    }
}//end ComputerFactory
