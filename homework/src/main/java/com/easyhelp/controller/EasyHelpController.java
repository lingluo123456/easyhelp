package com.easyhelp.controller;

import com.easyhelp.assistant.Assistant;
import com.easyhelp.pojo.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Tag(name = "EasyHelp")
@RestController
@RequestMapping("/easyhelp")
public class EasyHelpController {
    @Autowired
    private Assistant assistant;
    @Operation(summary = "对话")
    @PostMapping("/chat")
    public Flux<String> chat(@RequestBody ChatForm chatForm) {
        return assistant.chat(chatForm.getMemoryId(), chatForm.getMessage());
    }
}