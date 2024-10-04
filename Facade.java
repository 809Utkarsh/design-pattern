The Facade Pattern simplifies interactions with complex 
subsystems by providing a unified interface. 
Instead of directly interacting with multiple subsystems, 
the client communicates with the facade, 
which handles the details of the underlying subsystems

In the context of a Smart Home System, multiple 
subsystems—such as Lights, Thermostat, and SecuritySystem—exist, 
each with its own set of complex operations and behaviors. 
Instead of interacting with these individual subsystems, 
a SmartHomeFacade can provide a simplified API to control the entire system.

1. Subsystem Classes (Lights, Thermostat, SecuritySystem)
// Lights subsystem
// Facade class to simplify the control of subsystems
class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;

    // Constructor to initialize the subsystems
    public SmartHomeFacade(Lights lights, Thermostat thermostat, SecuritySystem securitySystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
    }

    // Simplified operation for starting the day
    public void startDayMode() {
        System.out.println("Starting Day Mode...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }

    // Simplified operation for starting the night mode
    public void startNightMode() {
        System.out.println("Starting Night Mode...");
        lights.dim(30);
        thermostat.setTemperature(18);
        securitySystem.arm();
    }

    // Simplified operation for leaving home
    public void leaveHomeMode() {
        System.out.println("Activating Leave Home Mode...");
        lights.turnOff();
        thermostat.turnOff();
        securitySystem.arm();
    }
}

