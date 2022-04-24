package com.company.questionnaireMs.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question_group")
public class QuestionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Group_id")
    private Integer id;

    @Column(name = "group_names")
    private String groupNames;

    @OneToMany(mappedBy = "questionGroup")
    private List<Question> questions;
}
