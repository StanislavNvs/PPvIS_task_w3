package org.openjfx.javafxarchetypesimple.question;

import org.openjfx.javafxarchetypesimple.answer.AnswerProduct;

public class ProductQuestion implements Question<AnswerProduct> {

    private String text;
    private AnswerProduct answer;

    public ProductQuestion(String text){
        this.text = text;
    }

    public void setAnswer(AnswerProduct answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public AnswerProduct getAnswer() {
        return answer;
    }
}
