package com.example.chatapp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/send")         // 對應前端的 /app/send
    @SendTo("/topic/messages")       // 廣播給所有人
    public ChatMessage send(ChatMessage message) {
        return message; // 直接把收到的訊息轉送出去
    }
}
