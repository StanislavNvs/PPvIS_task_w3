package org.openjfx.javafxarchetypesimple.answer;

import org.openjfx.javafxarchetypesimple.Eating;

public class AnswerEating implements Answer<Eating>{

    private Eating eating;

    public AnswerEating(Eating eating){

        this.eating = eating;
    }

    @Override
    public Eating getValue() {

        return eating;
    }
}
