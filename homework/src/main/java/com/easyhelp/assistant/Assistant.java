package com.easyhelp.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService(
        chatMemory = "chatMemory",
        chatMemoryProvider = "chatMemoryProvider"
)
public interface Assistant {
    String chat(@MemoryId int memoryId,
                @UserMessage String message);
}
