package ai.sandbox.sandy.ecommsample.service;

import ai.sandbox.sandy.ecommsample.record.Product;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceTools {

    @Tool(description = """
            Search the product catalog by keyword, category, or price range.
            
                    Use this tool whenever the customer asks about:
                      - What products are available ("do you have...", "show me...", "what laptops...")
                      - Product availability or stock ("is X in stock", "how many of Y are left")
                      - Price comparisons ("cheapest", "under $500", "most affordable")
            
                    After getting results, check inStock and stockQuantity before making availability claims.
                    If results are empty, tell the customer honestly and suggest alternatives or broader terms.
            
                    Good example inputs: "wireless headphones", "gaming laptops under 80000 INR", "running shoes"
            """)
    public List<Product> searchProducts(
            @ToolParam(description = """
                    Search keyword — product name, brand, category, or feature.
                    Be specific: 'Sony wireless headphones' beats 'headphones'
                    """) String keyword
    ) {
        //implementation would query the product database, but here we return a hardcoded example for demonstration

        return List.of(
                new Product(
                "p1",
               "Sony WH-1000XM4 Wireless Headphones",
                "Electronics > Audio > Headphones",
                299.99,
                        true,
                25,
                "Industry-leading noise canceling with Dual Noise Sensor technology.")
                );

    }
}
