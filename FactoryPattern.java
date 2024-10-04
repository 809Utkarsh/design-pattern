The Factory Pattern defines an interface for 
creating objects, but allows subclasses to decide 
which class to instantiate. This is useful when the 
exact type of object that needs to be created isn't 
known until runtime, allowing flexibility in object creation.

By using the Factory Pattern, you can centralize the 
creation of these devices, making it simple to add 
new device types (e.g., Smart Fan, Smart Speaker) 
without modifying the core logic of the system. 
This pattern also helps in avoiding tight coupling 
between the Smart Home System and the specific device types

How It Works:
You have a Device interface that defines common operations 
such as turnOn(), turnOff(), and status().
Each device type (e.g., Light, Thermostat, Camera) will 
implement this interface, but the way they behave may vary.
A DeviceFactory class will be responsible for creating the 
appropriate device object based on the user's input 
(e.g., when they want to add a new device to the system).