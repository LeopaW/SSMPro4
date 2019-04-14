package com.xa.controller;



import com.xa.pojo.Questions;
import com.xa.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private QuestionsService questionsService;


    @RequestMapping("/")
    public String index(Model model){

        List<Questions> questions = questionsService.queryAll();
        /*for(Questions q : questions){
            System.out.println(q.toString());
        }*/
        model.addAttribute("questions",questions);
        return "main";
    }
}
