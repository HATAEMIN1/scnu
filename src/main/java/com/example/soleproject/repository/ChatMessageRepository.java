package com.example.soleproject.repository;

import com.example.soleproject.entity.ChatMessageEntity;
import com.example.soleproject.entity.ClubScnu;
import com.example.soleproject.entity.Comment;
import com.example.soleproject.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;


public interface ChatMessageRepository extends JpaRepository<ChatMessageEntity, Long> {
    @Override
    List<ChatMessageEntity> findAll();
    ArrayList<ChatMessageEntity> findByClubScnu(ClubScnu scnu);

    ArrayList<ChatMessageEntity> findByMember(Member member);
}
