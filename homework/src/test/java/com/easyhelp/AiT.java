package com.easyhelp;

import com.easyhelp.assistant.Assistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AiT {
    @Autowired
    private QwenChatModel qwenChatModel;

    @Autowired
    private Assistant assistant;

    @Test
    public void testChatMemory5() {
            String answer1 = assistant.chat(1,"我是环环");
            System.out.println(answer1);
            String answer2 = assistant.chat(1,"我是谁");
            System.out.println(answer2);
            String answer3 = assistant.chat(2,"我是谁");
            System.out.println(answer3);
    }

}
