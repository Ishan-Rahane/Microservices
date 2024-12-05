package com.question.controller;

import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionServiceController {

    private QuestionService questionService;

    public QuestionServiceController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question getById(@PathVariable Long id){
        return questionService.getOne(id);
    }

    //get all questions from specific quiz by sending quiz id in request
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionsByQuizId(quizId);
    }
}
