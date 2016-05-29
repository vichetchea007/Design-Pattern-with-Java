/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author vichet
 */
public class Computer {

    private String cpu;
    private String hdd;
    private String wifi;
    private String bluetooth;
    private String webCam;
    private String fingerPrint;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.wifi = builder.hdd;
        this.bluetooth = builder.bluetooth;
        this.webCam = builder.webCam;
        this.fingerPrint = builder.fingerPrint;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", hdd=" + hdd + ", wifi=" + wifi + ", bluetooth=" + bluetooth + ", webCam=" + webCam + ", fingerPrint=" + fingerPrint + '}';
    }

    
    public static class Builder {

        private String cpu;
        private String hdd;
        private String wifi;
        private String bluetooth;
        private String webCam;
        private String fingerPrint;

        public Builder() {

        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public void setHdd(String hdd) {
            this.hdd = hdd;
        }

        public void setWifi(String wifi) {
            this.wifi = wifi;
        }

        public void setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
        }

        public void setWebCam(String webCam) {
            this.webCam = webCam;
        }

        public void setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
        }

        public Computer build() {
            return new Computer(this);
        }

        

    }
    
    public static void main(String[] args) {
        Computer.Builder pcBuilder = new Computer.Builder();
        pcBuilder.setCpu("2.4");
        pcBuilder.setHdd("100GB");
        pcBuilder.setBluetooth("Bluetooth");
        pcBuilder.setWebCam("Wifi");
        pcBuilder.setFingerPrint("Finger Print");
        Computer pc = pcBuilder.build();
        System.out.println(pc);
    }

}
