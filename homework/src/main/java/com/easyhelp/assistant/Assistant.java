package com.easyhelp.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

@AiService(
        chatMemory = "chatMemory",
        streamingChatModel= "qwenStreamingChatModel",
        chatMemoryProvider = "chatMemoryProvider",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverEasyHelpPinecone"
)
public interface Assistant {
    @SystemMessage(fromResource = "EasyHelp-prompt-template.txt")
    Flux<String> chat(@MemoryId Long memoryId,
              @UserMessage String message);
}
