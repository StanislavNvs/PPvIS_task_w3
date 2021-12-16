package org.openjfx.javafxarchetypesimple.answer;

public class AnswerCount implements Answer<Integer>{

    private int numberOfServings;

    public AnswerCount(int numberOfServings){

        this.numberOfServings = numberOfServings;
    }

    @Override
    public Integer getValue() {
        return numberOfServings;
    }
}
