package objectoriented.inheritance.multilevelinheritance;

public class Order {
    protected String orderId;
    protected String orderDate;
    protected double amount;

    public Order() {
        this.orderId = "Unknown";
        this.orderDate = "Unknown";
        this.amount = 0.0;
    }

    public Order(String orderId, String orderDate, double amount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + getOrderStatus());
    }
}
