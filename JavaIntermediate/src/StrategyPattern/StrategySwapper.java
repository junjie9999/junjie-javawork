package StrategyPattern;

public class StrategySwapper {
    ConnectionStrategy strategy;

    public void setStrategy(BluetoothStrategy bluetoothStrategy) {
      //  this.strategy = bluetoothStrategy;
    }

    public void connect(String phoneName) {
        strategy.connectTo(phoneName);
    }
}