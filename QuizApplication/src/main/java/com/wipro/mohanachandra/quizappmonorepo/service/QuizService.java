package com.wipro.mohanachandra.quizappmonorepo.service;

import java.util.List;

import com.wipro.mohanachandra.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.mohanachandra.quizappmonorepo.entities.Quiz;
import com.wipro.mohanachandra.quizappmonorepo.entities.Response;

public interface QuizService {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Long id);

	Integer calculatedResult(Long id, List<Response> responses);

}
