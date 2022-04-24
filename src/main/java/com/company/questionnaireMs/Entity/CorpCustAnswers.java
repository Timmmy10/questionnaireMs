package com.company.questionnaireMs.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "corp_cust_answers")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class CorpCustAnswers {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "status")
    private String status;

    @Column(name = "insert_date")
    private LocalDate date;

    @Column(name = "customer_id")
    private String customerNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "answer_id",referencedColumnName = "Corp_Id")
    private CorpAnswer corpAnswer;

    @Column(name ="answer")
    private String answer;

}
