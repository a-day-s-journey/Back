package dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserSearch {


    private Long id;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime birth;
    private String photoPath;
    private String mbti;



}
