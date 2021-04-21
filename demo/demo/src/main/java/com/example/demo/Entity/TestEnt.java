package com.example.demo.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@Entity
public class TestEnt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String str;
}
