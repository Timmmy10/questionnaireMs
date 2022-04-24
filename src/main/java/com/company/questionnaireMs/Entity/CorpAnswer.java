package com.company.questionnaireMs.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "corp_answers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CorpAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Corp_Id")
    private Integer id;


    @Column(name = "Answer")
    private String answer;

    @ManyToOne
    @JoinColumn(name = "Question_id",referencedColumnName = "id_question")
    private Question question;


    @OneToMany(mappedBy = "corpAnswer")
    private List<CorpCustAnswers> corpCustAnswers;
}

