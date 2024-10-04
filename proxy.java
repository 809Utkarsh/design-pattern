The Proxy Pattern provides a surrogate or 
placeholder for another object to control access to it. 
This is useful for adding additional functionality like 
lazy initialization, logging, access control, or managing 
expensive resources without directly interacting with the underlying object.

In the context of a Smart Home System, 
imagine that connecting to certain devices 
(like a security system or smart thermostat) 
might be expensive in terms of resources. For example:
Connecting to the thermostat might involve initializing 
a connection with the device, which can be time-consuming 
or resource-heavy.

Proxy:
// Proxy for Thermostat
class ThermostatProxy implements SmartDevice {
    private Thermostat thermostat;
    private boolean isOn;
    
    public ThermostatProxy() {
        this.isOn = false; // Default to off without initializing the actual Thermostat
    }

    // Lazily initialize the Thermostat when first accessed
    private void initializeThermostat() {
        if (thermostat == null) {
            thermostat = new Thermostat();
        }
    }

    @Override
    public void turnOn() {
        initializeThermostat();  // Initialize only when turning on the thermostat
        thermostat.turnOn();
        isOn = true;
    }

    @Override
    public void turnOff() {
        if (thermostat != null) {
            thermostat.turnOff();
        }
        isOn = false;
    }

    @Override
    public boolean isDeviceOn() {
        return isOn;
    }
}
