package com.example.quizApp.models;

import lombok.Data;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Data
public class Appeal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "result_id", referencedColumnName = "id")
    private ResultDetail resultDetail;
    private String proof;

}
