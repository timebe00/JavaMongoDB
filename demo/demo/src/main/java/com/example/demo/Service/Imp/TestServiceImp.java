package com.example.demo.Service.Imp;

import com.example.demo.Entity.TestEnt;
import com.example.demo.Repository.TestRepository;
import com.example.demo.Service.TestService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class TestServiceImp implements TestService  {
    @Autowired
    private TestRepository repository;


    @Override
    public String input(TestEnt test) throws Exception {
        log.info("input");
        //  넣기
//        TestEnt see = repository.save(test);
//        log.info(see+"");
        //  찾기
        List list = repository.findById(1);
        log.info(list + "");

        return null;
    }
}
