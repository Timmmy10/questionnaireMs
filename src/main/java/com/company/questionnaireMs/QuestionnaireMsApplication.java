package com.company.questionnaireMs;

import com.company.questionnaireMs.Entity.CorpCustAnswers;
import com.company.questionnaireMs.Repository.CorpAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootApplication
public class QuestionnaireMsApplication {

	@Autowired
	CorpAnswerRepository corpAnswerRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuestionnaireMsApplication.class, args);
	}



	@Bean
	@Transactional
  public CommandLineRunner run(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				List<CorpCustAnswers> corpCustAnswersList = corpAnswerRepository.findCorpCustAnswersByCustomerNumber("1234567");
				System.out.println(corpCustAnswersList);

			}
		};
	}
}
