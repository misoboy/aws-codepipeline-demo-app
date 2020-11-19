package kr.misoboy.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/health")
    public ResponseEntity health(){
        return new ResponseEntity("It`s OK", HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity index(){
        return new ResponseEntity("Hello, World", HttpStatus.OK);
    }
}
