package com.easyhelp;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LLMtest {
    @Autowired
    private QwenChatModel qwenChatModel;
    @Test
    public void testDashScopeQwen() {
//向模型提问
        String answer = qwenChatModel.chat("北京有什么好玩的地方，举例4个，只说名字");
//输出结果
        System.out.println(answer);
    }
}
