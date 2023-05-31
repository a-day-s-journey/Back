package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import repository.UserRepository;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;



}
