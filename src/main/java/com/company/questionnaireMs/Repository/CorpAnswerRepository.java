package com.company.questionnaireMs.Repository;

import com.company.questionnaireMs.Entity.CorpCustAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CorpAnswerRepository extends JpaRepository<CorpCustAnswers,String> {

    List<CorpCustAnswers> findCorpCustAnswersByCustomerNumber(String customerNumber);
}
