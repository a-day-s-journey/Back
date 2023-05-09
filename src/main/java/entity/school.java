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
public class school {

    @Id @GeneratedValue(strategy = IDENTITY)
    @NotNull
    private long schoolCode;

    @NotNull
    private String schoolLevel;

    @NotNull
    private String schoolName;

}
