package com.xa.controller;

import com.xa.pojo.Questions;
import com.xa.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionsService questionsService;

    @RequestMapping("/add")
    public String add(Questions questions){
        boolean flag = questionsService.add(questions);
        return "redirect:/";
    }

    @RequestMapping("/get/answers/{id}")
    public String getQuestionsWithAnswers(@PathVariable("id")Long id, Model model){
        Questions q = questionsService.queryWithAnswers(id);
        model.addAttribute("questions",q);
        return "findDetail";
    }
}
