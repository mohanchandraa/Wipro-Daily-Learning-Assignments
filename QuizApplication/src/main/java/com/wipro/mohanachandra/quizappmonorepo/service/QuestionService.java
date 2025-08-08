package com.wipro.mohanachandra.quizappmonorepo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.mohanachandra.quizappmonorepo.entities.Question;

public interface QuestionService {

	Question addNewQuestion(Question question);

	List<Question> getAllQuestions();

	Question getQuestionById(Long id);

	void deleteQuestionById(Long id);

	Question patchUpdateQuestionById(Long id, Question question);

	Page<Question> findAllQuestionPage(Pageable pageable);

}
