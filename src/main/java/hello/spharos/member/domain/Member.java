package hello.spharos.member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;

import java.util.Date;

import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.GenerationType.*;

@Getter
@Entity
public class Member {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Comment("회원 이름")
    @Column(nullable = false, length = 20)
    private String name;

    @Comment("회원 닉네임")
    @Column(nullable = false, length = 20)
    private String nickname;

    @Comment("회원 생년월일")
    @Column(nullable = false, length = 20)
    private Date birth;

    @Comment("회원 전화번호")
    @Column(nullable = false, length = 20)
    private String phone;

    @Comment("회원 이메일")
    @Column(nullable = false, length = 50)
    private String email;

    @Comment("회원 비밀번호")
    @Column(nullable = false, length = 100) // 해시값으로 저장할 예정이기에 길이를 늘려준다
    private String password;

    @Comment("회원 주소")
    @Column(nullable = false, length = 100)
    private String address;

    @Enumerated(STRING)
    private Gender gender;

    public Member(String name, String nickname, Date birth, String phone, String email, String password, String address, Gender gender) {
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
        this.gender = gender;
    }
}
