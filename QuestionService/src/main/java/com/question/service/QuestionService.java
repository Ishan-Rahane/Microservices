package com.question.service;

import com.question.entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne(Long id);

    List<Question> getQuestionsByQuizId(Long id);
}
