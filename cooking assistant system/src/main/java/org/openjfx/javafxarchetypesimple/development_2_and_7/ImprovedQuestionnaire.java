package org.openjfx.javafxarchetypesimple.development_2_and_7;

import org.openjfx.javafxarchetypesimple.answer.AnswerEating;
import org.openjfx.javafxarchetypesimple.answer.AnswerProduct;
import org.openjfx.javafxarchetypesimple.question.EatingQuestion;
import org.openjfx.javafxarchetypesimple.question.ProductQuestion;
import org.openjfx.javafxarchetypesimple.question.Questionnaire;

public class ImprovedQuestionnaire extends Questionnaire {

    CountQuestion countQuestion;
    AnswerCount answerCount;

    public ImprovedQuestionnaire(EatingQuestion eatingQuestion, ProductQuestion productQuestion,
                                 CountQuestion countQuestion, AnswerEating answerEating, AnswerProduct answerProduct,
                                 AnswerCount answerCount) {
        super(eatingQuestion, productQuestion, answerEating, answerProduct);

        this.countQuestion = countQuestion;
        this.answerCount = answerCount;
    }

    @Override
    public void init(){

        super.init();
        countQuestion.setAnswer(answerCount);
    }
}
