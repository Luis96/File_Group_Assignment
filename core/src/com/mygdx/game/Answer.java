package com.mygdx.game;

import com.google.gson.annotations.SerializedName;

public class Answer
{
    @SerializedName("answer_id")
    private int answerId;
    @SerializedName("answer_description")
    private String answerDescription;
    @SerializedName("answer_information")
    private String answerInformation;
    @SerializedName("answer_health")
    private double answerHealth;
    @SerializedName("answer_emotion")
    private double answerEmotion;
    @SerializedName("answer_hygiene")
    private double answerHygiene;
    @SerializedName("answer_money")
    private double answerMoney;
    @SerializedName("answer_strike")
    private double answerStrike;

    public int getAnswerId()
    {
        return answerId;
    }

    public void setAnswerId(int answerId)
    {
        this.answerId = answerId;
    }

    public String getAnswerDescription()
    {
        return answerDescription;
    }

    public void setAnswerDescription(String answerDescription)
    {
        this.answerDescription = answerDescription;
    }

    public String getAnswerInformation()
    {
        return answerInformation;
    }

    public void setAnswerInformation(String answerInformation)
    {
        this.answerInformation = answerInformation;
    }

    public double getAnswerHealth()
    {
        return answerHealth;
    }

    public void setAnswerHealth(double answerHealth)
    {
        this.answerHealth = answerHealth;
    }

    public double getAnswerEmotion()
    {
        return answerEmotion;
    }

    public void setAnswerEmotion(double answerEmotion)
    {
        this.answerEmotion = answerEmotion;
    }

    public double getAnswerHygiene()
    {
        return answerHygiene;
    }

    public void setAnswerHygiene(double answerHygiene)
    {
        this.answerHygiene = answerHygiene;
    }

    public double getAnswerMoney()
    {
        return answerMoney;
    }

    public void setAnswerMoney(double answerMoney)
    {
        this.answerMoney = answerMoney;
    }

    public double getAnswerStrike()
    {
        return answerStrike;
    }

    public void setAnswerStrike(double answerStrike)
    {
        this.answerStrike = answerStrike;
    }
}