package objectoriented.inheritance.multilevelinheritance;

import java.util.Scanner;

public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    private String receiverName;

    public DeliveredOrder() {
        super();
        this.deliveryDate = "Unknown";
        this.receiverName = "Unknown";
    }

    public DeliveredOrder(String orderId, String orderDate, double amount, String trackingNumber,
                          String shippingDate, String deliveryDate, String receiverName) {
        super(orderId, orderDate, amount, trackingNumber, shippingDate);
        this.deliveryDate = deliveryDate;
        this.receiverName = receiverName;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Received By: " + receiverName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Online Retail Order Management ---\n");

        System.out.println("Enter Order Details:");
        System.out.print("Order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Order Date (YYYY-MM-DD): ");
        String orderDate = scanner.nextLine();
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nEnter Shipping Details:");
        System.out.print("Tracking Number: ");
        String trackingNumber = scanner.nextLine();
        System.out.print("Shipping Date (YYYY-MM-DD): ");
        String shippingDate = scanner.nextLine();

        System.out.println("\nEnter Delivery Details:");
        System.out.print("Delivery Date (YYYY-MM-DD): ");
        String deliveryDate = scanner.nextLine();
        System.out.print("Receiver Name: ");
        String receiverName = scanner.nextLine();

        System.out.println("\n--- Order at Different Stages ---");

        System.out.println("\n1. Order Placed:");
        Order placedOrder = new Order(orderId, orderDate, amount);
        placedOrder.displayOrderDetails();

        System.out.println("\n2. Order Shipped:");
        ShippedOrder shippedOrder = new ShippedOrder(orderId, orderDate, amount, trackingNumber, shippingDate);
        shippedOrder.displayOrderDetails();

        System.out.println("\n3. Order Delivered:");
        DeliveredOrder deliveredOrder = new DeliveredOrder(orderId, orderDate, amount, trackingNumber,
                                                           shippingDate, deliveryDate, receiverName);
        deliveredOrder.displayOrderDetails();

        scanner.close();
    }
}
