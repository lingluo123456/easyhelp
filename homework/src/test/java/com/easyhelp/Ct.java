package com.easyhelp;

import com.easyhelp.assistant.Assistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Ct {
    @Autowired Assistant assistant;

    @Test
    public void test() {
        System.out.println(assistant.chat(1L, "我是张三"));
        System.out.println(assistant.chat(1L, "我是谁"));
        System.out.println(assistant.chat(2L, "我是谁"));
    }
}
