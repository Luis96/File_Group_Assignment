package com.mygdx.game;

public class Singleton
{
    private static Singleton instance;

    private Question[] questions;
    private Answer[] answers;

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }

        return instance;
    }

    public Question[] getQuestions()
    {
        return questions;
    }

    public void setQuestions(Question[] questions)
    {
        this.questions = questions;
    }

    public Answer[] getAnswers()
    {
        return answers;
    }

    public void setAnswers(Answer[] answers)
    {
        this.answers = answers;
    }
}