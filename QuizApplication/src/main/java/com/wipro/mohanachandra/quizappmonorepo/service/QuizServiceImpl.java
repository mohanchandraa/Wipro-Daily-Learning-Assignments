package com.wipro.mohanachandra.quizappmonorepo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mohanachandra.quizappmonorepo.entities.Question;
import com.wipro.mohanachandra.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.mohanachandra.quizappmonorepo.entities.Quiz;
import com.wipro.mohanachandra.quizappmonorepo.entities.Response;
import com.wipro.mohanachandra.quizappmonorepo.repository.QuestionRepository;
import com.wipro.mohanachandra.quizappmonorepo.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	

	@Override
	public Quiz createQuiz(String category, String level, String title) {
		List<Question> questions = questionRepository.findRandomQuestionsByCategoryAndLevel(category, level);
		Quiz quiz = new Quiz();
	    quiz.setQuizTitle(title);
	    quiz.setQuestions(questions);
	    
	    return quizRepository.save(quiz);
	}

	@Override
	public List<QuestionWrapper> getQuizQuestions(Long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
        List<Question> questionsFromDB = quiz.getQuestions();
		List<QuestionWrapper> questionsForUser = new ArrayList<>();
	
		for(Question q : questionsFromDB) {
			QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
			questionsForUser.add(qw);
		}
		
		return questionsForUser;
	}

	@Override
	public Integer calculatedResult(Long id, List<Response> responses) {
		Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));		
		List<Question> questions = quiz.getQuestions();
		
		int rightAnswerScore = 0;
		
		for(Response response : responses) {
			for(Question question : questions) {
				if(question.getId()==response.getId()) {
					if(question.getCorrectAnswer().equalsIgnoreCase(response.getUserAnswer())) {
						rightAnswerScore++;
					}
					break;
				}
			}
		}
		return rightAnswerScore;
	}

}
