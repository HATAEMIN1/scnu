    package com.example.soleproject.dto;

    import com.example.soleproject.entity.ClubScnu;
    import com.example.soleproject.member.Member;
    import lombok.Data;
    import lombok.Getter;
    import lombok.Setter;

    @Data
    public class ChatForm {

        private Long id;
        private String username;
        private String content;
        private ClubScnu clubScnu;
    }