package objectoriented.inheritance.multilevelinheritance;

public class ShippedOrder extends Order {
    protected String trackingNumber;
    protected String shippingDate;

    public ShippedOrder() {
        super();
        this.trackingNumber = "Unknown";
        this.shippingDate = "Unknown";
    }

    public ShippedOrder(String orderId, String orderDate, double amount, String trackingNumber, String shippingDate) {
        super(orderId, orderDate, amount);
        this.trackingNumber = trackingNumber;
        this.shippingDate = shippingDate;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Shipping Date: " + shippingDate);
    }
}
