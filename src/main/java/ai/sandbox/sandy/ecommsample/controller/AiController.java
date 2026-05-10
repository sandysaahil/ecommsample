package ai.sandbox.sandy.ecommsample.controller;

import ai.sandbox.sandy.ecommsample.service.AiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/ask")
    public String ask(@RequestParam String msg) {
        return aiService.ask(msg);
    }
}
