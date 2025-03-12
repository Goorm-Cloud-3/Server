package com.example.HospitalServer.Rent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RentController {
    private final String default_text = "hello, ";

    @GetMapping("/hello")
    public ResponseEntity<?> ReturnHello(@RequestParam("name") String name){
        String text = default_text + name;

        return ResponseEntity.ok(text);
    }
}
