// Abstract class "ElectronicDevice"
abstract class ElectronicDevice {
    // Abstract method (must be implemented by subclasses)
    abstract void powerOn();

    // Regular method
    void deviceInfo() {
        System.out.println("Electronic devices assist people in daily life.");
    }
}
