package main;

import modelo.Order;
import modelo.DatabaseMysqlRepository;
import modelo.OrderReportGenerator;
import modelo.OrderRepository;
import modelo.ReportGenerator;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        OrderRepository orderRepository = new DatabaseMysqlRepository();
        ReportGenerator reportGenerator = new OrderReportGenerator();
        Order order = new Order("ORD123", 250.75, orderRepository, reportGenerator);

        // Guardar la orden en la base de datos
        order.saveOrder();

        // Generar y mostrar el reporte de la orden
        String report = order.generateReport();
        System.out.println(report);
    }
}
