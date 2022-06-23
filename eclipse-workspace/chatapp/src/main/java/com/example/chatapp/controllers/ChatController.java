package com.example.chatapp.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import com.example.chatapp.model.ChatMessage;


@Controller
public class ChatController {
	//método que controla o envio de mensagens
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
		return chatMessage;
	}
	
	
//metodo que controla o acesso insercao de usuarios na aplicaçao
	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headAcessor) {


		//possibilitar a insercao/adicao de um username e consequentemente um novo usuario na web socket session

	headAcessor.getSessionAttributes().put("username", chatMessage.getSender());
	return chatMessage;
	}
	
}
