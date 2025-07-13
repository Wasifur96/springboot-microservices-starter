package com.wasifur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getAll() {
        return List.of("User1", "User2");
    }
}
