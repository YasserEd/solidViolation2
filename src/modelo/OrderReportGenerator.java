package modelo;

public class OrderReportGenerator implements ReportGenerator {

    @Override
    public String generateReport(Order order) {
        // Lógica para generar el reporte
        return "Report for Order ID: " + order.getOrderId() + " with amount: " + order.getAmount();
    }
}
