package com.example.demo.Controller;

import com.example.demo.Entity.TestEnt;
import com.example.demo.Service.TestService;
import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class TestController {
    @Autowired
    private TestService service;

    @GetMapping("/")
    public ResponseEntity test () throws Exception {
        log.info("test");
        TestEnt test = new TestEnt();
        test.setStr("안녕하세요");
        test.setId(1);
        service.input(test);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
