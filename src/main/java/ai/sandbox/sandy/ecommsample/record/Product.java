package ai.sandbox.sandy.ecommsample.record;

public record Product(
        String id,
        String name,
        String category,
        double price,
        boolean inStock,
        int stockQuantity,
        String shortDescription
) {}