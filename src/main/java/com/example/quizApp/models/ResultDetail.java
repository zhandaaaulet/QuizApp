package com.example.quizApp.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ResultDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "result_id")
    private Result result;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    private Integer answer;

    public boolean isTrue() {
        return this.question.getAnswerNumber().equals(this.answer);
    }
}
