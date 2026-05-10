package ai.sandbox.sandy.ecommsample.record;

public record PolicyAnswer(
        String policyArea,       // "returns" | "shipping" | "warranty"
        String answer,
        String policyLink        // URL to the full policy document
) {}

