package modelo;

public class Order {

    private String orderId;
    private double amount;
    private OrderRepository orderRepository;
    private ReportGenerator reportGenerator;

    public Order(String orderId, double amount, OrderRepository orderRepository, ReportGenerator reportGenerator) {
        this.orderId = orderId;
        this.amount = amount;
        this.orderRepository = orderRepository;
        this.reportGenerator = reportGenerator;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void saveOrder() {
        orderRepository.save(this);
        System.out.println("Order saved in database");
    }

    public String generateReport() {
        return reportGenerator.generateReport(this);
    }
}
