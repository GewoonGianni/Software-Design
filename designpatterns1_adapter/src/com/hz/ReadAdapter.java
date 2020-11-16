package com.hz;

import java.util.ArrayList;

public class ReadAdapter {
    private ArrayList<String> goodAnswers;

    /**
     * Constructor
     */
    public ReadAdapter () {
        this.goodAnswers = new ArrayList<String>();
    }

    /**
     * This function adapts the answer to fit what is expected by the program
     * @param msg This is the message that will be checked
     * @return this boolean will tell if it is a good or bad answer
     */
    public boolean adapt (String msg) {
        boolean included = false;
        for (String string : goodAnswers) {
            if (string.matches(msg)){
                included = true;
            }
        }
        return included;
    }

    /**
     * this will add an arrayList of strings to the good answers
     * @param newAnswers the answers to be added
     */
    public void addAnswers(ArrayList<String> newAnswers) {
        this.goodAnswers.addAll(newAnswers);
    }

    /**
     * this function will remove a string from an arrayList if it's included
     * @param msg the string to be removed
     */
    public void removeAnswer(String msg) {
        int i = 0;
        for (String string : goodAnswers) {
            if(string.matches(msg)){
                this.goodAnswers.remove(i);
            }
            i++;
        }
    }
}
