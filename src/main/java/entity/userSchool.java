package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
public class userSchool {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    private Long userId;

    private String SchoolId;

    private int graduationYear;

}