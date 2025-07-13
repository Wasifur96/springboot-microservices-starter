package com.wasifur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<String> getAll() {
        return List.of("Order1", "Order2");
    }
}
