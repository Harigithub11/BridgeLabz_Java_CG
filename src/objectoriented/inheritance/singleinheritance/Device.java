package objectoriented.inheritance.singleinheritance;

public class Device {
    protected String deviceId;
    protected boolean status;

    public Device() {
        this.deviceId = "Unknown";
        this.status = false;
    }

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn() {
        this.status = true;
        System.out.println("Device " + deviceId + " is now ON.");
    }

    public void turnOff() {
        this.status = false;
        System.out.println("Device " + deviceId + " is now OFF.");
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
