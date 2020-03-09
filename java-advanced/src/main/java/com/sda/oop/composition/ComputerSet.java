package com.sda.oop.composition;

// composition
public class ComputerSet {

    // HAS-A
    private Monitor monitor;
    private Mouse mouse;

    public ComputerSet(Monitor monitor, Mouse mouse) {
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public void process() {
        monitor.turnOn();
        mouse.click();
        System.out.println("processing...");
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
