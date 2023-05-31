package dto.response;

import entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {//응답클래스

    private Long id;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime birth;
    private String photoPath;

    public UserResponse(User user) { //생성자 오버로딩
        this.id = user.getId();
        this.name = user.getName();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        this.birth = user.getBirth();
        this.photoPath = user.getPhotoPath();
    }

}
