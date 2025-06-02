package com.easyhelp.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService(
        chatMemory = "chatMemory",
        chatMemoryProvider = "chatMemoryProvider"
)
public interface Assistant {
    @SystemMessage(fromResource = "easyhelp-prompt-template.txt")
    String chat(@MemoryId Long memoryId,
                @UserMessage String message);
}
