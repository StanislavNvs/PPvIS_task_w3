package org.openjfx.javafxarchetypesimple.question;

import org.openjfx.javafxarchetypesimple.answer.AnswerEating;
import org.openjfx.javafxarchetypesimple.answer.AnswerProduct;
import org.openjfx.javafxarchetypesimple.question.EatingQuestion;
import org.openjfx.javafxarchetypesimple.question.ProductQuestion;


public class Questionnaire {

    private EatingQuestion eatingQuestion;
    private ProductQuestion productQuestion;
    private AnswerEating answerEating;
    private AnswerProduct answerProduct;

    public Questionnaire(EatingQuestion eatingQuestion, ProductQuestion productQuestion,
                         AnswerEating answerEating, AnswerProduct answerProduct){

        this.eatingQuestion = eatingQuestion;
        this.productQuestion = productQuestion;
        this.answerEating = answerEating;
        this.answerProduct = answerProduct;
    }

    public void init(){

        eatingQuestion.setAnswer(answerEating);
        productQuestion.setAnswer(answerProduct);
    }
}
