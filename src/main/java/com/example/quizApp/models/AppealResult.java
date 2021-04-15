package com.example.quizApp.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AppealResult {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    @JoinColumn(name = "appeal_id", referencedColumnName = "id")
    private Appeal appeal;
    private boolean is_approved;
}
