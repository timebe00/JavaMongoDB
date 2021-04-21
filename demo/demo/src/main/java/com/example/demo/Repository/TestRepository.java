package com.example.demo.Repository;

import com.example.demo.Entity.TestEnt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends MongoRepository<TestEnt, Integer> {
    public List findById(int input);
}
