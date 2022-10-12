package StrategyPattern;

public class BluetoothStrategy {
    public void connectToBluetooth(String phone) {
        System.out.println(String.format("Connecting with %s through Bluetooth...", phone));
        System.out.println("Bluetooth connected.");
    }
}
