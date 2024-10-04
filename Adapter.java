. Adapter Pattern (Structural)
The Adapter Pattern allows incompatible interfaces to work 
together by acting as a bridge.


For the Smart Home System exercise, we can imagine a 
scenario where different smart devices have inconsistent 
interfaces. For example, some devices (like lights) 
may have a simple turnOn/turnOff interface, 
while other devices (like thermostats) might 
use a setTemperature method. We can use the 
Adapter Pattern to standardize the interface for 
all devices, allowing them to be controlled via a 
common central hub interface.

Exiting design interface
// Different device types with different interfaces
class Light {
    public void powerOn() {
        System.out.println("Light is turned on.");
    }

    public void powerOff() {
        System.out.println("Light is turned off.");
    }
}

class Thermostat {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat temperature set to " + temperature + " degrees.");
    }

    public int getTemperature() {
        return temperature;
    }
}

class DoorLock {
    public void lock() {
        System.out.println("Door is locked.");
    }

    public void unlock() {
        System.out.println("Door is unlocked.");
    }
}
