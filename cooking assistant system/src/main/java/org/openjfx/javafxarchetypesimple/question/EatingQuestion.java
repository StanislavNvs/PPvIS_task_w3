package org.openjfx.javafxarchetypesimple.question;

import org.openjfx.javafxarchetypesimple.answer.AnswerEating;

public class EatingQuestion implements Question<AnswerEating> {

    private String text;
    private AnswerEating answer;

    public EatingQuestion(String text){

        this.text = text;
    }

    public void setAnswer(AnswerEating answer) {
        this.answer = answer;
    }

    public AnswerEating getAnswer() {
        return answer;
    }

    public String getText() {
        return text;
    }
}
