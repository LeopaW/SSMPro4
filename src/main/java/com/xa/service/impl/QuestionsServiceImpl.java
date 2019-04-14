package com.xa.service.impl;

import com.xa.mapper.QuestionsMapper;
import com.xa.pojo.Questions;
import com.xa.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("questionsService")
public class QuestionsServiceImpl implements QuestionsService {


    @Autowired
    private QuestionsMapper questionsMapper;

    @Override
    public List<Questions> queryAll() {
        return questionsMapper.queryAll();
    }

    @Override
    public boolean add(Questions questions) {
        questions.setLastModified(new Date());
        return questionsMapper.add(questions) == 1?true:false;
    }

    @Override
    public Questions queryWithAnswers(Long id) {
        Questions q = questionsMapper.queryWithAnswers(id);
        return q;
    }
}
