package com.easyhelp;

import com.easyhelp.assistant.MemoryChatAssistant;
import com.easyhelp.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(5,"今天几号");
        System.out.println(answer);
    }

    @Autowired
    private MemoryChatAssistant memoryChatAssistant;

    @Test
    public void testUserMessage() {
        String answer1 = memoryChatAssistant.chat("我是wr");
        System.out.println(answer1);

        String answer2 = memoryChatAssistant.chat("我21了");
        System.out.println(answer2);

        String answer3 = memoryChatAssistant.chat("你知道我是谁吗，多大了");
        System.out.println(answer3);
    }

    @Test
    public void testV() {
        String answer1 = separateChatAssistant.chat2(10, "我是环环");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat2(10, "我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testUserInfo() {

        //从数据库中获取用户信息
        String username = "翠花";
        int age = 18;

        String answer = separateChatAssistant.chat3(20, "我是谁，我多大了", username, age);
        System.out.println(answer);
    }
}