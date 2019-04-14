package com.xa.service.impl;

import com.xa.mapper.AnswersMapper;
import com.xa.mapper.QuestionsMapper;
import com.xa.pojo.Answers;
import com.xa.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("answerService")
public class AnswersServiceImpl implements AnswerService {

    @Autowired
    private AnswersMapper answersMapper;

    @Autowired
    private QuestionsMapper questionsMapper;

    @Override
    public boolean add(Answers answers) {
        answers.setAnsDate(new Date());
        int row = answersMapper.add(answers);
        //需要给问题回答次数加一
        if(row == 1){
            //添加
            row = questionsMapper.updateAnsCountPlusOne(answers.getQid());
            return row == 1? true:false;
        }else{
            return false;
        }

    }
}
