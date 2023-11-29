//package com.example.soleproject.controller;
//
//import com.example.soleproject.SessionConst;
//import com.example.soleproject.dto.ChatForm;
//import com.example.soleproject.entity.ChatMessageEntity;
//import com.example.soleproject.entity.ClubScnu;
//import com.example.soleproject.entity.Comment;
//import com.example.soleproject.member.Member;
//import com.example.soleproject.member.MemberRepository;
//import com.example.soleproject.repository.ChatMessageRepository;
//import com.example.soleproject.repository.ClubRepository;
//import com.example.soleproject.service.ChatService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//
//@RequiredArgsConstructor
//@Controller
//@Slf4j
//public class ChatController {
//    private final ClubRepository clubRepository;
//    private final ChatMessageRepository chatMessageRepository;
//    private final ChatService chatService;
//    private final MemberRepository memberRepository;
//
//
//
//    @GetMapping("/scnu/chat")
//    public String chat(@SessionAttribute(name = SessionConst.LOGIN_MEMBER, required = false) Member member, @ModelAttribute ChatForm chatForm, Long id, Model model) {
////        List<ChatMessageEntity> messages = chatService.getAllMessages();
////        Optional<Member> memberid = memberRepository.findById(id);
////        ChatMessageEntity ChatMessageEntity = new ChatMessageEntity();
////        chatMessageRepository.save(ChatMessageEntity);
////        model.addAttribute("messages", messages);
////        model.addAttribute("member", member);
////        model.addAttribute("newMessage", new ChatMessageEntity());
////        model.addAttribute("username", ChatMessageEntity.getUsername());
////        model.addAttribute("id", memberid);
////        log.info("username123={}", ChatMessageEntity.getUsername());
//        return "/scnu/board/chat";
//    }
//
//    @PostMapping("/scnu/chat/send")
//    public String sendMessage(ChatMessageEntity chatMessage, Model model, Member member, @ModelAttribute ChatForm chatForm) {
//        chatService.saveMessage(chatMessage);
////        ClubScnu clubScnu = clubRepository.findById(id).orElse(null);
////        chatForm.setClubScnu(clubScnu);
////        ChatMessageEntity chatMessageEntity = new ChatMessageEntity();
////        chatMessageEntity.saveChat(member, chatForm.getClubScnu(), chatForm.getUsername(), chatForm.getContent());
////        chatMessageRepository.save(chatMessageEntity);
////        model.addAttribute("member", member);
////        model.addAttribute("newMessage", new ChatMessageEntity());
//        return "redirect:/scnu/chat";
//    }
//}