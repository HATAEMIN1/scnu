package com.example.soleproject.service;

import com.example.soleproject.entity.ChatMessageEntity;
import com.example.soleproject.entity.ClubScnu;
import com.example.soleproject.repository.ChatMessageRepository;
import com.example.soleproject.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    private final ChatMessageRepository chatMessageRepository;

    @Autowired
    public ChatService(ChatMessageRepository chatMessageRepository, ClubRepository clubRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public List<ChatMessageEntity> getAllMessages() {
        return chatMessageRepository.findAll();
    }

    public void saveMessage(ChatMessageEntity chatMessage) {
        chatMessageRepository.save(chatMessage);
    }
}
