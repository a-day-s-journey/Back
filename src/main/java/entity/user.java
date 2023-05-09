package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
public class user {

    @Id @GeneratedValue(strategy = IDENTITY)
    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @NotNull
    private String address;

    private LocalDateTime birth;

    private String photoPath;

    private String e_schoolCode;

    private String m_schoolCode;

    private String h_schoolCode;







}
