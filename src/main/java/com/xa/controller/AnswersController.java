package com.xa.controller;

import com.xa.pojo.Answers;
import com.xa.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.AnnotatedWildcardType;

@Controller
@RequestMapping("/answers")
public class AnswersController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping("/add")
    public String add(Answers answers){
        boolean flag = answerService.add(answers);
        return "redirect:/";
    }
}
