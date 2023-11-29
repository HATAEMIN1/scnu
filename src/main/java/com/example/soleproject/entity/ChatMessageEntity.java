package com.example.soleproject.entity;

import com.example.soleproject.member.Member;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class ChatMessageEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String content;

    @ManyToOne
    @JoinColumn
    private ClubScnu clubScnu;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Member member;
    // Getter, Setter, Constructors

    public void saveChat(Member member,ClubScnu clubScnu,String username, String content) {
        this.username = username;
        this.content = content;
        this.member = member;
        this.clubScnu = clubScnu;

    }

}
