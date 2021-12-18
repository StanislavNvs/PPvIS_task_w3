package org.openjfx.javafxarchetypesimple.development_2_and_7;

import org.openjfx.javafxarchetypesimple.development_2_and_7.AnswerCount;
import org.openjfx.javafxarchetypesimple.question.Question;

public class CountQuestion implements Question<AnswerCount> {

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
