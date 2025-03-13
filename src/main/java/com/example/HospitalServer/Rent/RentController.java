package com.example.HospitalServer.Rent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/test")
public class RentController {
    private final String default_text = "hello, ";

    @GetMapping("/hello")
    public ResponseEntity<?> ReturnHello(@RequestParam("name") String name,
                                         @RequestParam("age") int age){

        String birth_year = "" + CalAge(age);
        String text = default_text + name + "(" + birth_year + ")";

        return ResponseEntity.ok(text);
    }

    private int CalAge(int age){
        return LocalDate.now().getYear() - (age-1);
    }
}
