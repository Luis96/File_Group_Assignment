package com.mygdx.game;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Question implements Serializable
{
    public enum QuestionPriority
    {
        QUESTION_PRIORITY_LOW()
                {
                    public int getIntegerValue()
                    {
                        return 1;
                    }

                    public String getStringValue()
                    {
                        return "Low";
                    }
                },
        QUESTION_PRIORITY_MEDIUM()
                {
                    public int getIntegerValue()
                    {
                        return 2;
                    }

                    public String getStringValue()
                    {
                        return "Medium";
                    }
                },
        QUESTION_PRIORITY_HIGH()
                {
                    public int getIntegerValue()
                    {
                        return 3;
                    }

                    public String getStringValue()
                    {
                        return "High";
                    }
                };

        public abstract int getIntegerValue();
        public abstract String getStringValue();
    }

    @SerializedName("question_id")
    private int questionId;
    @SerializedName("question_priority")
    private QuestionPriority questionPriority;
    @SerializedName("question_description")
    private String questionDescription;
    @SerializedName("question_answers")
    private int[] questionAnswers;

    public int getQuestionId()
    {
        return questionId;
    }

    public void setQuestionId(int questionId)
    {
        this.questionId = questionId;
    }

    public QuestionPriority getQuestionPriority()
    {
        return questionPriority;
    }

    public void setQuestionPriority(QuestionPriority questionPriority)
    {
        this.questionPriority = questionPriority;
    }

    public String getQuestionDescription()
    {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription)
    {
        this.questionDescription = questionDescription;
    }

    public int[] getQuestionAnswers()
    {
        return questionAnswers;
    }

    public void setQuestionAnswers(int[] questionAnswers)
    {
        this.questionAnswers = questionAnswers;
    }
}