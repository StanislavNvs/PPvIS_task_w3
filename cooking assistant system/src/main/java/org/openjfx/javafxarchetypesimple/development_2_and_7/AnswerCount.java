package org.openjfx.javafxarchetypesimple.development_2_and_7;

import org.openjfx.javafxarchetypesimple.answer.Answer;

public class AnswerCount implements Answer<Integer> {

    private int numberOfServings;

    public AnswerCount(int numberOfServings){

        this.numberOfServings = numberOfServings;
    }

    @Override
    public Integer getValue() {
        return numberOfServings;
    }
}
