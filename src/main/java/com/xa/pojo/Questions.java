package com.xa.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Questions {

    private Long id;
    private String title;
    private String detailDesc;
    private Integer answerCount;
    private Date lastModified;

    List<Answers> answers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {

        this.lastModified = lastModified;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }


    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detailDesc='" + detailDesc + '\'' +
                ", answerCount=" + answerCount +
                ", lastModified=" + lastModified +
                ", answers=" + answers +
                '}';
    }
}
