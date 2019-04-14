package com.xa.mapper;

import com.xa.pojo.Questions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionsMapper {
    List<Questions> queryAll();

    int add(Questions questions);

    Questions queryWithAnswers(@Param("id") Long id);

    int updateAnsCountPlusOne(@Param("qid") Long qid);
}
