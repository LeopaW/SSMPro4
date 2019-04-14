package com.xa.pojo;

import java.util.Date;

public class Answers {


    private long id;
    private String ansContent;
    private Date ansDate;

    private Long qid;


    private Questions questions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent;
    }

    public Date getAnsDate() {
        return ansDate;
    }

    public void setAnsDate(Date ansDate) {
        this.ansDate = ansDate;
    }

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }
}
