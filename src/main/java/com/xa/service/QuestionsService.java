package com.xa.service;

import com.xa.pojo.Questions;

import java.util.List;

public interface QuestionsService {
    List<Questions> queryAll();

    boolean add(Questions questions);

    Questions queryWithAnswers(Long id);
}
