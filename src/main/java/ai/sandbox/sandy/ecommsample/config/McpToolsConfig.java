package ai.sandbox.sandy.ecommsample.config;

import ai.sandbox.sandy.ecommsample.service.EcommerceTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpToolsConfig {

    /**
     * ToolCallbackProvider is the bridge between your @Tool-annotated methods
     * and the MCP protocol layer.
     *
     * Spring AI reflects over your EcommerceTools class, finds every @Tool method,
     * reads the descriptions and parameter annotations, and generates a JSON Schema
     * for each tool. That schema is what gets sent to MCP clients when they ask
     * "what tools do you have?"
     *
     * The LLM then reads those schemas to understand your tools — before it has
     * even seen a single customer message.
     */
    @Bean
    public ToolCallbackProvider ecommerceToolProvider(EcommerceTools tools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(tools)
                .build();
    }
}
