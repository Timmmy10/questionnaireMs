package com.company.questionnaireMs.Entity;
import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "corp_question")
@Getter
@Setter
@RequiredArgsConstructor
public class Question {

    @Id
    @Column(name = "id_question")
    private Integer questionId;

    @Column(name = "question")
    private String questions;

    @ManyToOne
    @JoinColumn(name = "question_group_id", referencedColumnName = "Group_id")
    private QuestionGroup questionGroup;


    @OneToMany(mappedBy = "question")
    private List<CorpAnswer> corpAnswers;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Question question = (Question) o;
        return questionId != null && Objects.equals(questionId, question.questionId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
