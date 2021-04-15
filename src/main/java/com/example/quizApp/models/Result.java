package com.example.quizApp.models;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    @OneToMany(mappedBy = "result", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ResultDetail> resultDetailList;
    private int score;

    public Result() {
        this.score = 0;
    }

    public void addScore() {
        this.score += 1;
    }

    public void removeScore() {
        this.score -= 1;
    }
}
