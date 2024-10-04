Smart Home System project, the Builder Pattern can be used to 
construct complex objects like a Smart Home Configuration or a 
Device setup. This is particularly useful when you have a device 
with multiple configurable parameters that can vary significantly, 
such as a Security Camera that might have different settings for resolution, 
recording quality, and motion detection features.

You will define a DeviceConfiguration class that contains all 
the necessary parameters for a device.
You will then create a DeviceConfigurationBuilder 
class that provides methods to set each parameter, 
allowing users to configure the device incrementally.
Finally, the builder will have a method to build the final 
object once all necessary parameters have been set.

usage
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Step 3: Create a Security Camera configuration using the builder
        DeviceConfiguration cameraConfig = new DeviceConfiguration.Builder()
            .setResolution("1080p")
            .setStorageType("cloud")
            .setNightVision(true)
            .build();

        // Display the configuration
        System.out.println("Security Camera Configuration:");
        System.out.println("Resolution: " + cameraConfig.getResolution());
        System.out.println("Storage Type: " + cameraConfig.getStorageType());
        System.out.println("Night Vision: " + (cameraConfig.hasNightVision() ? "Enabled" : "Disabled"));
    }
}
