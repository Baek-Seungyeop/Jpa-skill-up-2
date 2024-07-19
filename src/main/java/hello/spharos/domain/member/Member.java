package hello.spharos.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.*;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;

}

