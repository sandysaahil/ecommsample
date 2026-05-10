package ai.sandbox.sandy.ecommsample.record;

import java.util.List;

public record Order(
        String orderId,
        String customerId,
        String status,           // "PROCESSING" | "SHIPPED" | "DELIVERED" | "CANCELLED"
        String estimatedDelivery,
        List<String> itemNames,
        double totalAmount
) {}