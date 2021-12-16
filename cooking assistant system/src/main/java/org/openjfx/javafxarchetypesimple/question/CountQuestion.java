package org.openjfx.javafxarchetypesimple.question;

import org.openjfx.javafxarchetypesimple.answer.AnswerCount;

public class CountQuestion implements Question<AnswerCount>{

    private String text;
    private AnswerCount answer;

    public CountQuestion(String text){

        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public AnswerCount getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerCount answer){

        this.answer = answer;
    }
}
