package com.easyhelp.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService(
        chatMemory = "chatMemory",
        chatMemoryProvider = "chatMemoryProvider",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverEasyHelp"
)
public interface Assistant {
    @SystemMessage(fromResource = "EasyHelp-prompt-template.txt")
    String chat(@MemoryId Long memoryId,
                @UserMessage String message);
}
