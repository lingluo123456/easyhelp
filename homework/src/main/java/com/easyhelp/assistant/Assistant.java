package com.easyhelp.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService(
        chatMemory = "chatMemory",// 配置记忆
        chatMemoryProvider = "chatMemoryProvider"
)
public interface Assistant {
    @SystemMessage(fromResource = "easyhelp-prompt-template.txt")// 系统消息提示词
    String chat(@MemoryId Long memoryId,
                @UserMessage String message);
}
