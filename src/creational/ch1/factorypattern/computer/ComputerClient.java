package creational.ch1.factorypattern.computer;

/**
 * @author vichet
 * @version 1.0
 * @created 14-Feb-2014 10:54:14 AM
 */
public class ComputerClient {

    public void orderComputer() {

        Computer pc = ComputerFactory.getComputer(
                "PC", "3GB", "100GB", "3.2GHz");
        System.out.println(pc);

        Computer server = ComputerFactory.getComputer(
                "SERVER", "8GM", "1TB", "3.5Ghz");
        System.out.println(server);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ComputerClient computerClient = new ComputerClient();
        computerClient.orderComputer();
    }

}//end ComputerClient


