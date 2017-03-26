package com.adventurekit.node_coyote.adventurekitapp;

/**
 * Created by node_coyote on 3/26/17.
 */

public class QuizQuestion {

    // A boolean to use with Radio Buttons.
    boolean mIsCorrectRadio;


    //Quiz Question constructor for Radio Buttons
    public QuizQuestion(boolean isCorrectRadio){
        
    }

    //Checks if user has chosen the correct
    public boolean getRadioAnswer(boolean isCorrectRadio){
        isCorrectRadio = mIsCorrectRadio;
        return isCorrectRadio;
    }
}
