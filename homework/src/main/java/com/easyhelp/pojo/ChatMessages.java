package com.easyhelp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "chat_messages")
public class ChatMessages {
    @Id
    private ObjectId id;
    private String messageId;
    private String content;
}
